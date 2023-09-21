package com.srk.teste;

import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.srk.teste.model.Produto;

@SpringBootApplication
public class TesteApplication {

    public static void main(String[] args) {
        SpringApplication.run(TesteApplication.class, args);

        CodecRegistry pojoCodecRegistry = CodecRegistries.fromRegistries(
        	    MongoClient.getDefaultCodecRegistry(),
        	    CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build())
        	);

        MongoClient mongoClient = new MongoClient("localhost:27017", MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());

        MongoDatabase database = mongoClient.getDatabase("dbproducts").withCodecRegistry(pojoCodecRegistry);

        MongoCollection<Produto> collection = database.getCollection("Produto", Produto.class);

        collection.insertOne(new Produto(1, "arroz", 10));
    }
}
