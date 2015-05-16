package com.lei.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lei.model.Hello;
import com.lei.model.Listing;
import com.lei.service.RedditService;

@RestController
public class RedditSearchController {

    //private final AtomicLong counter = new AtomicLong();
	
    private RedditService service;

    public void setRedditService(RedditService service) {
    	this.service = service;
    }

    
    
    @RequestMapping("/hello")
    public Hello hello(@RequestParam(value="name", defaultValue="New York") String name) {
    	Hello greeting = new Hello(name);
    	return greeting;
    }

    
    
    @RequestMapping("/reddit/search")
    public Listing search( @RequestParam(value="q") String keyword,
                           @RequestParam(value="fl", defaultValue="*") String fields) {
    	Listing jsonListing;
    	
    	if(this.service == null) { 	       // 'service' should be initialized by IoC
    		this.service = new RedditService();
    	}

    	try {
    	    jsonListing = service.search(keyword);
    	}
    	catch(UnsupportedEncodingException ex) {
    		ex.printStackTrace();
    		jsonListing = new Listing();
    	}
    	return jsonListing;
    }

}
