
package com.portafoliorcg.rcg.Controller;

import com.portafoliorcg.rcg.Entity.Educacion;
import com.portafoliorcg.rcg.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducacionController {
    @Autowired IEducacionService ieducacionService;
    
    @GetMapping("educacion/traer")
    public List<Educacion> getEducacion(){
        return ieducacionService.getEducacion();
    }
    
    @PostMapping("/educacion/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        ieducacionService.saveEducacion(educacion);
        return "La educacion fue creada correctamente";
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id){
        ieducacionService.deleteEducacion(id);
        return "La educacion fue eliminada correctamente";
    }
    
    @PutMapping("/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                                   @RequestParam("escuela") String nuevaEscuela,
                                   @RequestParam("titulo") String nuevoTitulo,
                                   @RequestParam("descripcion") String nuevaDescripcion,
                                   @RequestParam("fecha") String nuevaFecha,
                                   @RequestParam("img") String nuevaImagen){
            Educacion educacion = ieducacionService.findEducacion(id);
            
            educacion.setEscuela(nuevaEscuela);
            educacion.setTitulo(nuevoTitulo);
            educacion.setDescripcion(nuevaDescripcion);
            educacion.setFecha(nuevaFecha);
            educacion.setImg(nuevaImagen);
            
            ieducacionService.saveEducacion(educacion);
            return educacion;
    }
    
}
