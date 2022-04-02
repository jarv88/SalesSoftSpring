package com.yayecoder.SalesSoft.Models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="usuarios")
public class Usuarios implements Serializable {
    private static final long serialVersionUID = -561208975481652974L;

    @Getter
    @Setter
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 32)
    @Getter
    @Setter
    private String username;
    @Column(length = 32)
    @Getter
    @Setter
    private String password;
    @Column(length = 32)
    @Getter
    @Setter
    private String fullname;

}

