package com.project.poo.Lista;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import com.project.poo.Lista.Utils.Pessoa;

public class Ex004 {

	public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("luis", 22, "email@email.com"));
		pessoas.add(new Pessoa("hiandra", 22, "halves@email.com"));
		
		
		 Writer writer = Files.newBufferedWriter(Paths.get("pessoas.csv"));
		 StatefulBeanToCsv<Pessoa> beanToCsv = new StatefulBeanToCsvBuilder<Pessoa>(writer).build();

	     beanToCsv.write(pessoas);

	     writer.flush();
	     writer.close();
	}

}
