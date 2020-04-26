package com.zsmart.gestionComptabilite.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TypeOperation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private String reference;

    @OneToMany(mappedBy = "typeOperation",fetch = FetchType.LAZY)
    private List<OperationComptable> operationComptables = new ArrayList<OperationComptable>();

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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public List<OperationComptable> getOperationComptables() {
        return operationComptables;
    }

    public void setOperationComptables(List<OperationComptable> operationComptables) {
        this.operationComptables = operationComptables;
    }
}
