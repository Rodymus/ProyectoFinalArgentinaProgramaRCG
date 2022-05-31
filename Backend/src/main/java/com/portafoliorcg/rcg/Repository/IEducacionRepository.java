package com.portafoliorcg.rcg.Repository;

import com.portafoliorcg.rcg.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion, Long>{
    
}
