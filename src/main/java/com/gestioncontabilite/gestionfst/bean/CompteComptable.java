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

}
