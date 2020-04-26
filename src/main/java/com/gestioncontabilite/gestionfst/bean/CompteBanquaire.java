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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<FacturePaiement> getFacturePaiements() {
        return facturePaiements;
    }

    public void setFacturePaiements(List<FacturePaiement> facturePaiements) {
        this.facturePaiements = facturePaiements;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getNumeroRIB() {
        return numeroRIB;
    }

    public void setNumeroRIB(String numeroRIB) {
        this.numeroRIB = numeroRIB;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public String getSwiftcode() {
        return swiftcode;
    }

    public void setSwiftcode(String swiftcode) {
        this.swiftcode = swiftcode;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }
}
