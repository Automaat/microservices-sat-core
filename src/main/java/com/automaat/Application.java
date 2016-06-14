package com.automaat;

import com.automaat.model.SimpleResource;
import com.automaat.repositories.SimpleResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
//
//@Component
//class InsertDataCLR implements CommandLineRunner{
//
//    @Autowired
//    SimpleResourceRepository repository;
//
//    @Override
//    public void run(String... strings) throws Exception {
//        Stream.of("res1", "anotherRes", "res2")
//                .forEach(name -> repository.save(new SimpleResource(name)));
//    }
//}
