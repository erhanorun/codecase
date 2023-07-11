package com.restapi.codecase.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "categories")
@Data
public class CategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_generator")
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;
}
