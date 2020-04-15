package com.gestioncontabilite.gestionfst.bean;

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


}
