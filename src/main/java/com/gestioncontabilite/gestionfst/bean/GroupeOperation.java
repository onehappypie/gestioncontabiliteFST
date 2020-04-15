package com.gestioncontabilite.gestionfst.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GroupeOperation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "groupeOperation",fetch = FetchType.LAZY)
    private List<OperationComptable> terrains = new ArrayList<OperationComptable>();


}
