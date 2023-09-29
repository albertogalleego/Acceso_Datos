import { Component } from '@angular/core';

@Component({
  selector: 'ciudades',
  templateUrl:'./ciudades.component.html',
})
export class CiudadesComponent {

  public nombre_componente = 'Componente de ciudades';
  public listado_ciudades = 'Salamanca, Zamora, Madrid y Barcelona';
}
