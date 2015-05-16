package com.lei.service;

import java.util.Collections;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.client.RestTemplate;

import com.lei.model.Listing;

public class RedditService {
	Log log = LogFactory.getLog(RedditService.class);
	
	private static String host = "http://www.reddit.com";
	private static String searchEndpoint = host + "/r/subreddit/search.json";
	private RestTemplate restTemplate = new RestTemplate();
	
	/**
	 * Launch reddit search by provided keyword.
	 * @param keyword the word caller searches
	 * @param sort the sort method in which the documents are returned
	 * 				asc, desc, or N/A
	 * @return search result of Listing
	 */
	public Listing search(String keyword, String sort) {
		String url =  searchEndpoint + "?q="+keyword;
		log.info("Endpoint URL: "+url);

		Listing listing = null;
		try {
			//fetch listing from Reddit api
		    listing = restTemplate.getForObject(url, Listing.class);

	        //sort listing
			if(sort.equalsIgnoreCase("asc")) {
			    Collections.sort(listing.getData().getChildren());
			}
			else if(sort.equalsIgnoreCase("desc")) {
			    Collections.sort(listing.getData().getChildren());
			    Collections.reverse(listing.getData().getChildren());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
        return listing;
	}
}
