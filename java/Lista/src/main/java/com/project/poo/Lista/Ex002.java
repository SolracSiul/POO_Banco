package com.project.poo.Lista;

import java.io.FileOutputStream;

public class Ex002 {

	public static void main(String[] args) {
		byte data[] = {1,2,3};
		try {
			FileOutputStream out = new FileOutputStream("new File");
			out.write(data);
			out.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
