package com.project.poo.Lista;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex003 {

	public static void main(String[] args) {
		final String msg = "Olá professor";
		File file = new File("Arquivo.txt");
		
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
