package com.yayecoder.SalesSoft.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="articulos")
public class Articulos {

    @Getter
    @Setter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    @Getter
    @Setter
    private String codArticulo;

    @Column(length = 30)
    @Getter
    @Setter
    private String descripcion;

    @Column(name = "prevta")
    @Getter
    @Setter
    private Float precioVenta;
    @Column(name = "precos")
    @Getter
    @Setter
    private Float precioCosto;

}
