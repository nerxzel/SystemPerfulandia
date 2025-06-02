package com.TecnoTrans.SystemPerfulandia.microservicio_perfume.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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

    @Column(name = "NAME", nullable = false)
    @NotBlank(message = "El nombre del producto es obligatorio.")
    private String name;
    
    @Column(name = "STOCK", nullable = false)
    private int stock;
    
    @Column(name = "PRICE", nullable = false)
    private float price;
    
    @Column(name = "BRAND", nullable = false)
    @NotBlank(message = "El producto debe estar asociado a una marca")
    private String brand;

}
