package com.portafoliorcg.rcg.Controller;

import com.portafoliorcg.rcg.Entity.Experiencia;
import com.portafoliorcg.rcg.Interface.IExperienciaService;
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
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping("experiencia/traer")
    public List<Experiencia> getEperiencia(){
    return iexperienciaService.getExperiencia();
    }
    
    @PostMapping("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
        return "La experiencia fue creada correctamente";
    }
    
    @DeleteMapping("/experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
        return "La experiencia fue borrada correctamente";
    }
    
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                                                  @RequestParam("empresa")String nuevaEmpresa,
                                                  @RequestParam("puesto")String nuevoPuesto,
                                                  @RequestParam("descripcion")String nuevaDescripcion,
                                                  @RequestParam("fecha")String nuevaFecha,
                                                  @RequestParam("img")String nuevaImagen){
        
         Experiencia experiencia = iexperienciaService.findExperiencia(id);
         
         experiencia.setEmpresa(nuevaEmpresa);
         experiencia.setPuesto(nuevoPuesto);
         experiencia.setDescripcion(nuevaDescripcion);
         experiencia.setFecha(nuevaFecha);
         experiencia.setImg(nuevaImagen);
         
         iexperienciaService.saveExperiencia(experiencia);
         return experiencia;
         
          } 
    
    
}
