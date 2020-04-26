package com.gestioncontabilite.gestionfst.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Caisse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numero;
    private String libelle;
    @Column(precision = 11, scale = 4)
    private BigDecimal  montant;
    @OneToMany(mappedBy = "caisse")
    private List<FacturePaiement> facturePaiements=new ArrayList<FacturePaiement>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public List<FacturePaiement> getFacturePaiements() {
        return facturePaiements;
    }

    public void setFacturePaiements(List<FacturePaiement> facturePaiements) {
        this.facturePaiements = facturePaiements;
    }
}
