package com.projet5sae.gestiontransactioncontrat.repositories;

import com.projet5sae.gestiontransactioncontrat.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {
}
