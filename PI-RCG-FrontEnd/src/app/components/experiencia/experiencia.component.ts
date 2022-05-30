import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {

  listExperiencia: any[] = [
    { empresa: 'UNPA', puesto: 'Master en informática', descripcion: 'analista de datos', fecha: '2022'},
    { empresa: 'UTN', puesto: 'Lic. Org. Industrial', descripcion: 'analista de costos', fecha: '2009'},
    { empresa: '750', puesto: 'Perito Mercantil', descripcion: 'analista de contable', fecha: '1998'}
  ];

  constructor() { }

  ngOnInit(): void {
  }

  eliminarExperiencia(index: number){
    this.listExperiencia.splice(index, 1);
  }

}
