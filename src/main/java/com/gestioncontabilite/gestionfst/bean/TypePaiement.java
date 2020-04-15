package com.gestioncontabilite.gestionfst.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TypePaiement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private String libelle;
    @OneToMany(mappedBy = "typePaiement",fetch = FetchType.LAZY)
    private List<FacturePaiement> facturePaiements = new ArrayList<FacturePaiement>();

}
