package com.york.api.app;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
 

public class JsonParser {

	public static void main(String[] args) {
		try{
			ParserLikeDom(null);
			//xpathParser();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/*
	<dependency>
	    <groupId>com.googlecode.json-simple</groupId>
	    <artifactId>json-simple</artifactId>
	    <version>1.1.1</version>
	</dependency>
	This method is almost like DOM. It is not good for deep JSON data
	*/
	public static void ParserLikeDom(String[] args) {
		JSONParser parser = new JSONParser();

		String file = "C:\\york\\1.Projects\\47. GooglePlacesApi\\json_result.txt";
		try {
			Object obj = parser.parse(new FileReader(file));
			JSONObject jsonObject = (JSONObject) obj;

			String next_page_token = (String) jsonObject.get("next_page_token");
			String status = (String) jsonObject.get("status");

			System.out.println("next_page_token: " + next_page_token);
			System.out.println("status: " + status);
		
			JSONArray results = (JSONArray) jsonObject.get("results");

			System.out.println("\nCompany List:");
			
			Iterator<JSONObject> iterator = results.iterator();
			while (iterator.hasNext()) {
				JSONObject result=iterator.next();
			
				String icon=(String)result.get("icon");
				
				JSONArray photos = (JSONArray) result.get("photos");
				if (photos!=null) {
					Iterator<JSONObject> iteratorPhotos = photos.iterator();
					while (iteratorPhotos.hasNext()) {
						JSONObject photo=iteratorPhotos.next();
						String height=photo.get("height").toString();
						String photo_reference=(String)photo.get("photo_reference");
						String width=photo.get("width").toString();
						System.out.println("photo_reference: " + photo_reference);
						System.out.println("height: " + height);
						System.out.println("width: " + width);
					}
				}
				
				String id=(String)result.get("id");
				String place_id=(String)result.get("place_id");
				String vicinity=(String)result.get("vicinity");
				System.out.println("icon: " + icon);
				System.out.println("vicinity: " + vicinity);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	<dependency>
    	<groupId>com.jayway.jsonpath</groupId>
    	<artifactId>json-path</artifactId>
    	<version>2.2.0</version>
	</dependency>
	 */
		public static void xpathParser() throws Exception {
			String file = "C:\\york\\1.Projects\\47. GooglePlacesApi\\json_result.txt";
			String json = new String(Files.readAllBytes(Paths.get(file)));
			Object document = Configuration.defaultConfiguration().jsonProvider().parse(json);

			String next_page_token = JsonPath.read(document, "$.next_page_token");
			System.out.println(next_page_token);
			
			List<Object> results = JsonPath.read(document, "$.results");
			System.out.println(results.size());
			for (int cnt=0;cnt<results.size();cnt++) {
				int idx=cnt+1;
				Object geometry_viewport_northeast_lat = JsonPath.read(document, "$.results[" + cnt + "].geometry.viewport.northeast.lat");
				if (geometry_viewport_northeast_lat!=null)
					System.out.println(geometry_viewport_northeast_lat.toString());
				else
					System.out.println("NULL");
			}

	}
		
}
