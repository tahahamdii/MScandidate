package com.microservices.candidate.repo;

import com.microservices.candidate.entity.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatRepository extends JpaRepository<Candidat, Integer> {
        }
