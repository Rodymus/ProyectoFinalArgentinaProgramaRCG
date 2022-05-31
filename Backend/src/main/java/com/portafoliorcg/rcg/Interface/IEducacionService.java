package com.portafoliorcg.rcg.Interface;

import com.portafoliorcg.rcg.Entity.Educacion;
import java.util.List;

public interface IEducacionService {
    //Traer educacion
    public List<Educacion> getEducacion();
    
    //Guardar educacion
    public void saveEducacion(Educacion educacion);
    
    //Eliminar
    public void deleteEducacion(Long id);
    
    //Buscar educacion
    public Educacion findEducacion(Long id);
    
}
