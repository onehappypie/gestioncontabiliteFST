package com.gestioncontabilite.gestionfst.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private Date dateTransaction;
    private Date dateDeValidité;
    @Column(precision = 11, scale = 4)
    private BigDecimal totalpaimentespece;
    @Column(precision = 11, scale = 4)
    private BigDecimal  totalpaiementcheque;
    @ManyToOne
    private Fournisseur fournisseur;
    @ManyToOne
    private Societe societe;
    @OneToMany(mappedBy = "facture",fetch = FetchType.LAZY)
    private List<OperationComptable> operationComptables =new ArrayList<OperationComptable>();
    @OneToMany(mappedBy = "facture",fetch = FetchType.LAZY)
    private List<FactureItem> factureItems = new ArrayList<FactureItem>();
    @OneToMany(mappedBy = "facture",fetch = FetchType.LAZY)
    private List<FacturePaiement> facturePaiements = new ArrayList<FacturePaiement>();


}
