package com.automaat.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SimpleResource {

    @Id
    private String id = UUID.randomUUID().toString();

    private String name;

    public SimpleResource(String name) {
        this.name = name;
    }
}
