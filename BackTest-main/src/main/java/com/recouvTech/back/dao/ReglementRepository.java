package com.recouvTech.back.dao;

import com.recouvTech.back.entity.Reglement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReglementRepository extends JpaRepository<Reglement, Long> {

}
