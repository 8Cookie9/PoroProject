package com.poroproject.enitities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Headgear extends AbstractPersistable<Long>{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
}
