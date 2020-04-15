package com.gestioncontabilite.gestionfst.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Societe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ice;
    private String raisonSocial;
    private String adenomination;
    private String adresse;
    @OneToMany(mappedBy = "societe")
    private  List<CompteBanquaire> compteBanquaire=new ArrayList<CompteBanquaire>();
    @OneToMany(mappedBy = "societe")
    private  List<Facture> factures=new ArrayList<Facture>();


}
