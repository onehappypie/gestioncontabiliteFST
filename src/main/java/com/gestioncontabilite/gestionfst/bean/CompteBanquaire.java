package com.gestioncontabilite.gestionfst.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CompteBanquaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "compteBanquaire",fetch = FetchType.LAZY)
    private List<FacturePaiement> facturePaiements = new ArrayList<FacturePaiement>();
    private String numeroCompte;
    private String numeroRIB;
    private String banque;
    private String swiftcode;
    @ManyToOne
    private Societe societe;
}
