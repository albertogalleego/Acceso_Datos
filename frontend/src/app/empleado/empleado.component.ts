import { Component } from '@angular/core';
import { Empleado } from '../models/empleado';

@Component({
  selector: 'app-empleado',
  templateUrl: './empleado.component.html',
  styleUrls: ['./empleado.component.css']
})
export class EmpleadoComponent {

  public titulo = 'titulo del componente empleado';
  public empleado:Empleado;
  public trabajadores:Array<Empleado>

  constructor(){

    this.empleado = new Empleado('David Lopez', 45, 'Cocinero', true,true)
    this.trabajadores = [
      new Empleado('Manolo',35,'Cocinero',true,true),
      new Empleado('Lucia',38,'Secretaria',false,true),
      new Empleado('Paco',40,'Camarero',true,false)
    ]

  }

}
