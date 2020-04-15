package com.gestioncontabilite.gestionfst.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private String adresse;
    private String ice;
    @OneToMany(mappedBy ="fournisseur")
    private List<Facture> factures=new ArrayList<Facture>();


}
