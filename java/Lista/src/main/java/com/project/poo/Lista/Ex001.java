package com.project.poo.Lista;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class Ex001 {

	public static void main(String[] args) throws FileNotFoundException {
		Properties prop = new Properties();
		FileOutputStream fos = new FileOutputStream("class.properties");
		prop.setProperty("database", "mongodb");
		prop.setProperty("name", "aula01");
		try {
			System.out.println(prop.getProperty("database"));
			System.out.println(prop.getProperty("name"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
