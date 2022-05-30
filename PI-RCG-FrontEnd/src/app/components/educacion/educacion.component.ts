import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {

  listEducacion: any[] = [
    { escuela: 'UNPA', titulo: 'Master en informática', descripcion: 'analista de datos', fecha: '2022'},
    { escuela: 'UTN', titulo: 'Lic. Org. Industrial', descripcion: 'analista de costos', fecha: '2009'},
    { escuela: '750', titulo: 'Perito Mercantil', descripcion: 'analista de contable', fecha: '1998'}
  ];

  constructor() { }

  ngOnInit(): void {
  }

  eliminarEducacion(index: number){
    this.listEducacion.splice(index, 1);
  }

}
