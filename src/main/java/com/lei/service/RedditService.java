package com.lei.service;

import java.io.UnsupportedEncodingException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.client.RestTemplate;

import com.lei.model.Listing;

public class RedditService {
	Log log = LogFactory.getLog(RedditService.class);
	
	private static String host = "http://www.reddit.com";
	private static String searchEndpoint = host + "/r/subreddit/search.json";
	private RestTemplate restTemplate = new RestTemplate();
	
	public Listing search(String keyword) throws UnsupportedEncodingException {
		String url =  searchEndpoint + "?q="+keyword;
		log.info("Endpoint URL: "+url);

		//fetch listing from Reddit api
		Listing listing = null;
		try {
		    listing = restTemplate.getForObject(url, Listing.class);
	

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
        //sort listing
        
        return listing;
	}
}
