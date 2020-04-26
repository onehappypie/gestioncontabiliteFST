package com.gestioncontabilite.gestionfst.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CompteComptable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "compteComptable",fetch = FetchType.LAZY)
    private List<OperationComptable> operationComptables = new ArrayList<OperationComptable>();
    @ManyToOne
    private SousClassComptable sousClassComptable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OperationComptable> getOperationComptables() {
        return operationComptables;
    }

    public void setOperationComptables(List<OperationComptable> operationComptables) {
        this.operationComptables = operationComptables;
    }

    public SousClassComptable getSousClassComptable() {
        return sousClassComptable;
    }

    public void setSousClassComptable(SousClassComptable sousClassComptable) {
        this.sousClassComptable = sousClassComptable;
    }
}
