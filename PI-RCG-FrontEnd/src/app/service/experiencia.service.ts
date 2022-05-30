import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { experiencia } from '../model/experiencia.model';


@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  URL = 'http://localhost:8080/personas/';

  constructor(private http: HttpClient) { }

  public getExperiencia(): Observable<experiencia>{
    return this.http.get<experiencia>(this.URL+ 'traer/perfil');
  }

}
