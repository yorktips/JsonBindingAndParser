package com.york.api.app;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.york.api.utils.PlaceSearchResponse;

public class JsonToObject {

	public static void main(String[] args) throws Exception {
		String file = "C:\\york\\1.Projects\\47. GooglePlacesApi\\json_result.txt";
		String json = new String(Files.readAllBytes(Paths.get(file)));
		// Gson gson = new Gson();

		Gson gson = new GsonBuilder()
				.disableHtmlEscaping()
				.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
				.setPrettyPrinting().serializeNulls().create();

		// convert the json string back to object
		PlaceSearchResponse obj = gson.fromJson(json, PlaceSearchResponse.class);
		String out = gson.toJson(obj);
		System.out.println(out);

	}
}
