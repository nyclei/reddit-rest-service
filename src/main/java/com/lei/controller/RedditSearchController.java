package com.lei.controller;

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
    
    /**
     * Hello API
     * @param request a regular httpRequest
     * @param name a string value
     * @return Greeting message
     */
    @RequestMapping("/hello")
    public Hello hello( @Context HttpServletRequest request,
    					@RequestParam(value="name", defaultValue="New York") String name) {
    	log.info(request.getRequestURL().append('?').append(request.getQueryString()));
    	
    	Hello greeting = new Hello(name);
    	return greeting;
    }
    
    /**
     * Reddit Search API
     * @param request a regular httpRequest
     * @param keyword the word caller searches for
     * @param sort   asc  - sort document item by author name in ascending order
     * 				desc  - sort document item by author name in descending order
     *              [none]- no sort, the result is returned in original order
     * @return the sorted search result of Listing, which will be marshalling in JSON
     */
    @RequestMapping("/reddit/search")
    public Listing search( @Context HttpServletRequest request,
    					   @RequestParam(value="q") String keyword,
                           @RequestParam(value="sort-author", defaultValue="") String sort) {
    	log.info(request.getRequestURL().append('?').append(request.getQueryString()));
    	    	
    	if(this.service == null) { 	       // 'service' cold be initialized by IoC in spring App
    		this.service = new RedditService();
    	}
    	
        Listing jsonListing = service.search(keyword, sort);
        return jsonListing;
    }

}
