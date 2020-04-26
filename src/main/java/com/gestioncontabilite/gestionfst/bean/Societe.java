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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public String getAdenomination() {
        return adenomination;
    }

    public void setAdenomination(String adenomination) {
        this.adenomination = adenomination;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<CompteBanquaire> getCompteBanquaire() {
        return compteBanquaire;
    }

    public void setCompteBanquaire(List<CompteBanquaire> compteBanquaire) {
        this.compteBanquaire = compteBanquaire;
    }

    public List<Facture> getFactures() {
        return factures;
    }

    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }
}
