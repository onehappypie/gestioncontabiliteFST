package com.gestioncontabilite.gestionfst.bean;

import javax.persistence.*;

@Entity
public class OperationComptable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String libelle;
    @ManyToOne
    private SousClassComptable sousClassComptable;
    @ManyToOne
    private EtatOperationComptable etatOperationComptable;
    @ManyToOne
    private GroupeOperation groupeOperation;
    @ManyToOne
    private CompteComptable compteComptable;
    @ManyToOne
    private TypeOperation typeOperation;
   @ManyToOne
    private Facture facture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public SousClassComptable getSousClassComptable() {
        return sousClassComptable;
    }

    public void setSousClassComptable(SousClassComptable sousClassComptable) {
        this.sousClassComptable = sousClassComptable;
    }

    public EtatOperationComptable getEtatOperationComptable() {
        return etatOperationComptable;
    }

    public void setEtatOperationComptable(EtatOperationComptable etatOperationComptable) {
        this.etatOperationComptable = etatOperationComptable;
    }

    public GroupeOperation getGroupeOperation() {
        return groupeOperation;
    }

    public void setGroupeOperation(GroupeOperation groupeOperation) {
        this.groupeOperation = groupeOperation;
    }

    public CompteComptable getCompteComptable() {
        return compteComptable;
    }

    public void setCompteComptable(CompteComptable compteComptable) {
        this.compteComptable = compteComptable;
    }

    public TypeOperation getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(TypeOperation typeOperation) {
        this.typeOperation = typeOperation;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }
}
