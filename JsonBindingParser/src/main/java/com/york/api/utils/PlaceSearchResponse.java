package com.york.api.utils;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class PlaceSearchResponse {
	//private String next_page_token;
	@SerializedName("next_page_token")
	private String nextPageToken;
	private List<Result> results;
    private List<String> html_attributions;
	private String status;
    
	public PlaceSearchResponse() {
		super();
	}
    
	public PlaceSearchResponse(String status, List<Result> results,
			String nextPageToken, List<String> html_attributions) {
		super();
		this.status = status;
		this.results = results;
		this.nextPageToken = nextPageToken;
		this.html_attributions = html_attributions;
	}
    
    
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Result> getResults() {
		return results;
	}
	public void setResults(List<Result> results) {
		this.results = results;
	}
	public String getNextPageToken() {
		return nextPageToken;
	}
	public void SgetNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
	public List<String> getHtml_attributions() {
		return html_attributions;
	}
	public void setHtml_attributions(List<String> html_attributions) {
		this.html_attributions = html_attributions;
	}

    
}
