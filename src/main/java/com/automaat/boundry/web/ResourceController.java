package com.automaat.boundry.web;

import com.automaat.model.SimpleResource;
import com.automaat.repositories.SimpleResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RefreshScope
@RestController
@RequestMapping()
public class ResourceController {

    private final SimpleResourceRepository repository;

    @Value("${message}")
    private String message;

    @Autowired
    public ResourceController(SimpleResourceRepository repository) {
        this.repository = repository;
    }


    @RequestMapping(value = "/by-name/{name}", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<SimpleResource>> findByName(@PathVariable("name") String name) {

        return new ResponseEntity<>(repository.findByName(name), OK);
    }

    @RequestMapping(value = "/resources", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<SimpleResource>> findAll(){
        return new ResponseEntity<>(repository.findAll(), OK);
    }

    @RequestMapping(value = "/message", method = GET)
    public String testingConfig(){
        return this.message;
    }
}
