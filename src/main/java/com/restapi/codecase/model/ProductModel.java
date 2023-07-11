package com.restapi.codecase.model;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generator")
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="category_id", nullable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    CategoryModel categoryModel;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_mark")
    private String productMark;

    @Column(name = "product_price")
    private double productPrice;

}
