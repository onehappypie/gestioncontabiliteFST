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

}
