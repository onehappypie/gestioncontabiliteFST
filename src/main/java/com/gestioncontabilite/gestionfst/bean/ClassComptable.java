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

}
