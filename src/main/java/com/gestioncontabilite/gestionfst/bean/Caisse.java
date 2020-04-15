package com.gestioncontabilite.gestionfst.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Caisse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numero;
    @Column(precision = 11, scale = 4)
    private BigDecimal  montant;
    @OneToMany(mappedBy = "caisse")
    private List<FacturePaiement> facturePaiements=new ArrayList<FacturePaiement>();
}
