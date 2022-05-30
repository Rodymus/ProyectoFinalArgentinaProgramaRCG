export class experiencia {
  id?: number;
  empresa: String;
  puesto: String;
  descripcion: String;
  fecha: String;


  constructor(empresa: String, puesto: String, descripcion: String, fecha: String){
      this.empresa = empresa;
      this.puesto = puesto;
      this.descripcion = descripcion;
      this.fecha = fecha;
  }

}
