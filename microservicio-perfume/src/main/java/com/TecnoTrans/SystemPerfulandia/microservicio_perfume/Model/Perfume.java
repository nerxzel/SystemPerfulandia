package com.TecnoTrans.SystemPerfulandia.microservicio_perfume.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name="Perfumes")
@AllArgsConstructor
@NoArgsConstructor
public class Perfume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME")
    private String name;
    
    @Column(name = "STOCK")
    private int stock;
    
    @Column(name = "PRICE")
    private float price;
    
    @Column(name = "BRAND")
    private String brand;

}
