package com.portafoliorcg.rcg.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NotNull
  @Size(min = 1, max = 50, message = "no cumple con la longitud")
  private String empresa;
 
  @NotNull
  @Size(min = 1, max = 50, message = "no cumple con la longitud")
  private String puesto;
 
  @NotNull
  @Size(min = 1, max = 50, message = "no cumple con la longitud")
  private String descripcion;
 
  @NotNull
  @Size(min = 1, max = 50, message = "no cumple con la longitud")
  private String fecha;
  
  @Size(min = 1, max = 50, message = "no cumple con la longitud")
  private String img;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
  
  
  
}
