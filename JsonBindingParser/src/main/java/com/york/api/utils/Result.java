package com.york.api.utils;

import java.util.List;


public class Result {
	private String name;
	private String vicinity;
	private List<String> types;
	private Geometry geometry;
	private String icon;
	private String reference;
	private String id;
	private List<Photo> photos;
	private String place_id;
	private String scope;
	
	public Result() {
		super();
	}
	
	public Result(String name, String vicinity, List<String> types,
			Geometry geometry, String icon, String reference, String id,
			List<Photo> photos, String place_id, String scope) {
		super();
		this.name = name;
		this.vicinity = vicinity;
		this.types = types;
		this.geometry = geometry;
		this.icon = icon;
		this.reference = reference;
		this.id = id;
		this.photos = photos;
		this.place_id = place_id;
		this.scope = scope;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getVicinity() {
		return vicinity;
	}
	public void setVicinity(String vicinity) {
		this.vicinity = vicinity;
	}
	
	public List<String> getTypes() {
		return types;
	}
	public void setTypes(List<String> types) {
		this.types = types;
	}
	
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	

	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public List<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	
	public String getPlace_id() {
		return place_id;
	}
	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}
	
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	
}
