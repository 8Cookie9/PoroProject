package com.poroproject.repositories;

import com.poroproject.enitities.Poro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoroRepository extends JpaRepository<Poro, Long>{
    
}
