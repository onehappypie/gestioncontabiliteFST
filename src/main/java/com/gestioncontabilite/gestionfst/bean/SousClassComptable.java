package com.gestioncontabilite.gestionfst.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SousClassComptable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "",fetch = FetchType.LAZY)
    private List<CompteComptable> compteComptables = new ArrayList<CompteComptable>();
    private String libelle;

    @ManyToOne
    private ClassComptable classComptable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CompteComptable> getCompteComptables() {
        return compteComptables;
    }

    public void setCompteComptables(List<CompteComptable> compteComptables) {
        this.compteComptables = compteComptables;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public ClassComptable getClassComptable() {
        return classComptable;
    }

    public void setClassComptable(ClassComptable classComptable) {
        this.classComptable = classComptable;
    }
}
