package edu.citytech.cst.finalexam.utility;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.net.URL;

public class FileUtility {

	// get file from classpath, resources folder
	public File getFileFromResources(String fileName) {

		ClassLoader classLoader = getClass().getClassLoader();

		URL resource = classLoader.getResource(fileName);
		if (resource == null) {
			throw new IllegalArgumentException("file is not found!");
		} else {
			return new File(resource.getFile());
		}
	}
	
	
	public static String readFile(File file) {
		
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
			String st;			
			while ((st = br.readLine()) != null)
				sb.append(st);
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return sb.toString();
	}
	
	
}
