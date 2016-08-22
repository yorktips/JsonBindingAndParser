package com.york.api.utils;

public class Geometry {
	private Location location;
	private Viewport viewport;
	
	public Geometry() {
	}
	
	public Geometry(Location location, Viewport viewport) {
		super();
		this.location = location;
		this.viewport = viewport;
	}
	

	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Viewport getViewport() {
		return viewport;
	}
	public void setViewport(Viewport viewport) {
		this.viewport = viewport;
	}
	
}
