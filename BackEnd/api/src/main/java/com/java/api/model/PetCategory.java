/*
* create table pet_category(
category_id int auto_increment not null primary key,
pet_category_name varchar(45) not null,
category_creation_date date
);*/

package com.java.api.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pet_category")
@Data
public class PetCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", nullable = false)
    private Long id;
    @Column(name="pet_category_name",nullable = false)
    private String category_name;
    @Column(name="category_creation_date ",nullable = true)
    private Date creationDate;
}