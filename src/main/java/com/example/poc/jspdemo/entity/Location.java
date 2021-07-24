package com.example.poc.jspdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Location {


    @Id
//    @GeneratedValue
    private Integer id;

    private String code;

    private String name;

    private String type;


}
