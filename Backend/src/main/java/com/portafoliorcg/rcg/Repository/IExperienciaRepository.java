package com.portafoliorcg.rcg.Repository;

import com.portafoliorcg.rcg.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}
