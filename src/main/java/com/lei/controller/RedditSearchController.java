package com.lei.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lei.model.Hello;
import com.lei.model.Listing;
import com.lei.service.RedditService;

@RestController
public class RedditSearchController {
	Log log = LogFactory.getLog(RedditSearchController.class);

    private RedditService service;

    public void setRedditService(RedditService service) {
    	this.service = service;
    }
    
    @RequestMapping("/hello")
    public Hello hello( @Context HttpServletRequest request,
    					@RequestParam(value="name", defaultValue="New York") String name) {
    	log.info(request.getRequestURL().append('?').append(request.getQueryString()));
    	
    	Hello greeting = new Hello(name);
    	return greeting;
    }
    
    @RequestMapping("/reddit/search")
    public Listing search( @Context HttpServletRequest request,
    					   @RequestParam(value="q") String keyword,
                           @RequestParam(value="sort-author", defaultValue="") String sort) {
    	log.info(request.getRequestURL().append('?').append(request.getQueryString()));
    	    	
    	if(this.service == null) { 	       // 'service' should be initialized by IoC
    		this.service = new RedditService();
    	}
    	
        Listing jsonListing = service.search(keyword, sort);
        return jsonListing;
    }

}
