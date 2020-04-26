package com.gestioncontabilite.gestionfst.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class ClassComptable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private String numero;
    @OneToMany(mappedBy = "classComptable",fetch = FetchType.LAZY)
    private List<SousClassComptable> sousClassComptables = new ArrayList<SousClassComptable>();

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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public List<SousClassComptable> getSousClassComptables() {
        return sousClassComptables;
    }

    public void setSousClassComptables(List<SousClassComptable> sousClassComptables) {
        this.sousClassComptables = sousClassComptables;
    }
}
