package com.portafoliorcg.rcg.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Educacion {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NotNull
  @Size(min = 1, max = 50, message = "no cumple con la longitud")
  private String escuela;
 
  @NotNull
  @Size(min = 1, max = 50, message = "no cumple con la longitud")
  private String titulo;
 
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

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
