package com.poroproject.enitities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Type extends AbstractPersistable<Integer>{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String type;
    private int healthModifier;
    private int attackModifier;
    private int defenseModifier;
}
