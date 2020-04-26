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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<FacturePaiement> getFacturePaiements() {
        return facturePaiements;
    }

    public void setFacturePaiements(List<FacturePaiement> facturePaiements) {
        this.facturePaiements = facturePaiements;
    }
}
