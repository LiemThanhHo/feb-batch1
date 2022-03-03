package com.example.repository;

import com.example.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,String> {

    //@Query("from Account where balance=:balance")
    List<Account> findByBalanceGreaterThan(double balance);

}
