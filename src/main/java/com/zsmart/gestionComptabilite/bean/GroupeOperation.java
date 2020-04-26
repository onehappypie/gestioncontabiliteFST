package com.zsmart.gestionComptabilite.bean;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OperationComptable> getTerrains() {
        return terrains;
    }

    public void setTerrains(List<OperationComptable> terrains) {
        this.terrains = terrains;
    }
}
