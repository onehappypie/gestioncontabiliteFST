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
    private Date datedepaiement;
    @ManyToOne
    private Facture facture;
    @ManyToOne
    private TypePaiement typePaiement;
    @ManyToOne
    private CompteBanquaire compteBanquaire;
    @ManyToOne
    private Caisse caisse;
    @Column(precision = 11, scale = 4)
    private BigDecimal montant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatedepaiement() {
        return datedepaiement;
    }

    public void setDatedepaiement(Date datedepaiement) {
        this.datedepaiement = datedepaiement;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public TypePaiement getTypePaiement() {
        return typePaiement;
    }

    public void setTypePaiement(TypePaiement typePaiement) {
        this.typePaiement = typePaiement;
    }

    public CompteBanquaire getCompteBanquaire() {
        return compteBanquaire;
    }

    public void setCompteBanquaire(CompteBanquaire compteBanquaire) {
        this.compteBanquaire = compteBanquaire;
    }

    public Caisse getCaisse() {
        return caisse;
    }

    public void setCaisse(Caisse caisse) {
        this.caisse = caisse;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }
}
