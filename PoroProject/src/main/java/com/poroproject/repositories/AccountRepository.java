package com.poroproject.repositories;

import com.poroproject.enitities.Account;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByUsername(String username);
}
