package com.projet5sae.gestiontransactioncontrat.repositories;

import com.projet5sae.gestiontransactioncontrat.entities.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
    @Query("select c from Transaction c where c.montant =:montant")
    public Page<Transaction> TransactionByMontant(@Param("montant") float n, Pageable pageable);
}
