package com.gestion.commerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.commerce.Model.Historique;

@Repository
public interface HistoRepository extends JpaRepository<Historique, Long>{
    
}
