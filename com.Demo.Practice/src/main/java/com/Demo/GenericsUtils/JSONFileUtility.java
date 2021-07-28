package com.Demo.GenericsUtils;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

public class JSONFileUtility {
	public String readDataFromJson(String key) throws Throwable {
		//Read the data from json
				FileReader inputFile = new FileReader(IPathConstants.JSONPATH);
				
				//parse the json object into java data stream
				JSONParser parser = new JSONParser();
				Object obj = parser.parse(inputFile);
				
				//type cast the object into hashmap and read the data in key value format
				HashMap jobj=(HashMap)obj;
				String value = jobj.get(key).toString();
				return value;
	}

}
