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

}
