package com.gestioncontabilite.gestionfst.bean;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class FactureItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Facture facture;
    private String reference;
    private String designation;
    @Column(precision = 11, scale = 4)
    private BigDecimal  prixHT;
    @Column(precision = 11, scale = 4)
    private BigDecimal quantite;
    @Column(precision = 11, scale = 4)
    private BigDecimal  totalHT;


}
