package com.zsmart.gestionComptabilite.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private Date dateTransaction;
    private Date dateDeValidité;
    @Column(precision = 11, scale = 4)
    private BigDecimal totalpaimentespece;
    @Column(precision = 11, scale = 4)
    private BigDecimal  totalpaiementcheque;
    @ManyToOne
    private Fournisseur fournisseur;
    @ManyToOne
    private Societe societe;
    @OneToMany(mappedBy = "facture",fetch = FetchType.LAZY)
    private List<OperationComptable> operationComptables =new ArrayList<OperationComptable>();
    @OneToMany(mappedBy = "facture",fetch = FetchType.LAZY)
    private List<FactureItem> factureItems = new ArrayList<FactureItem>();
    @OneToMany(mappedBy = "facture",fetch = FetchType.LAZY)
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

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public Date getDateDeValidité() {
        return dateDeValidité;
    }

    public void setDateDeValidité(Date dateDeValidité) {
        this.dateDeValidité = dateDeValidité;
    }

    public BigDecimal getTotalpaimentespece() {
        return totalpaimentespece;
    }

    public void setTotalpaimentespece(BigDecimal totalpaimentespece) {
        this.totalpaimentespece = totalpaimentespece;
    }

    public BigDecimal getTotalpaiementcheque() {
        return totalpaiementcheque;
    }

    public void setTotalpaiementcheque(BigDecimal totalpaiementcheque) {
        this.totalpaiementcheque = totalpaiementcheque;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public List<OperationComptable> getOperationComptables() {
        return operationComptables;
    }

    public void setOperationComptables(List<OperationComptable> operationComptables) {
        this.operationComptables = operationComptables;
    }

    public List<FactureItem> getFactureItems() {
        return factureItems;
    }

    public void setFactureItems(List<FactureItem> factureItems) {
        this.factureItems = factureItems;
    }

    public List<FacturePaiement> getFacturePaiements() {
        return facturePaiements;
    }

    public void setFacturePaiements(List<FacturePaiement> facturePaiements) {
        this.facturePaiements = facturePaiements;
    }
}
