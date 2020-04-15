package com.gestioncontabilite.gestionfst.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class FacturePaiement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Facture facture;
    @ManyToOne
    private TypePaiement typePaiement;
    @ManyToOne
    private CompteBanquaire compteBanquaire;
    @ManyToOne
    private Caisse caisse;

    private Date datedepaiement;
    @Column(precision = 11, scale = 4)
    private BigDecimal montant;


}
