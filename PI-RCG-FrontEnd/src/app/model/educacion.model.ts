export class educacion {
  id?: number;
  escuela: String;
  titulo: String;
  descripcion: String;
  fecha: String;


  constructor(escuela: String, titulo: String, descripcion: String, fecha: String){
      this.escuela = escuela;
      this.titulo = titulo;
      this.descripcion = descripcion;
      this.fecha = fecha;
  }

}
