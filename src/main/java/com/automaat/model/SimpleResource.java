package com.automaat.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
@Builder
public class SimpleResource {

    @Id
    private String id = UUID.randomUUID().toString();

    private String name;
}
