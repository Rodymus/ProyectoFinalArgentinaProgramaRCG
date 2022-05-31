
package com.portafoliorcg.rcg.Service;

import com.portafoliorcg.rcg.Entity.Educacion;
import com.portafoliorcg.rcg.Interface.IEducacionService;
import com.portafoliorcg.rcg.Repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEducacionService implements IEducacionService {
    @Autowired IEducacionRepository IeducacionRepository;
    
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion = IeducacionRepository.findAll();
        return educacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        IeducacionRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(Long id) {
        IeducacionRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion educacion = IeducacionRepository.findById(id).orElse(null);
        return educacion;
                
    }
    
}
