
package com.portafoliorcg.rcg.Service;

import com.portafoliorcg.rcg.Entity.Experiencia;
import com.portafoliorcg.rcg.Interface.IExperienciaService;
import com.portafoliorcg.rcg.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ImpExperienciaService implements IExperienciaService {

    @Autowired IExperienciaRepository iexperienciaRepository;
    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = iexperienciaRepository.findAll();
        return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        iexperienciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        iexperienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = iexperienciaRepository.findById(id).orElse(null);
        return experiencia;
    }
    
}
