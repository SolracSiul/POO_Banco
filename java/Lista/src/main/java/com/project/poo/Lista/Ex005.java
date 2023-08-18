package com.project.poo.Lista;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ex005 {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/Fluminense_Football_Club").get();
		String title = doc.getElementsByTag("h1").text();
		
		final String msg = title;
		File file = new File("Scraping.txt");
		
		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(msg);
			bw.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}


	}

}
