package com.yayecoder.SalesSoft.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class Clientes {

    @Getter
    @Setter
    @Column(name = "codcliente")
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String CodCliente;

    @Column(length = 50)
    @Getter
    @Setter
    private String nombre;

    @Column(length = 50)
    @Getter
    @Setter
    private String nombre_comercial;

    @Column(length = 120)
    @Getter
    @Setter
    private String direccion;
    @Column(length = 30)
    @Getter
    @Setter
    private String telefono;
    @Column(length = 30)
    @Getter
    @Setter
    private String email;
    @Column(length = 10)
    @Getter
    @Setter
    private String xtipdoc;
    @Column(length = 20)
    @Getter
    @Setter
    private String xnumdoc;

}
