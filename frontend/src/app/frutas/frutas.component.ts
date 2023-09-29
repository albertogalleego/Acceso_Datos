import { Component } from '@angular/core';

@Component({
  selector: 'frutas',
  templateUrl:'./frutas.component.html',
})
export class FrutasComponent {

  public nombre_componente = 'Componente de frutas';
  public listado_frutas = 'Manzana, Platano, Sandia, Pera y Fresa';

  public nombre: String;
  public edad: number;
  public mayorDeEdad: boolean;
  public trabajos: Array<string>

  constructor(){
    this.nombre = 'David';
    this.edad = 66;
    this.mayorDeEdad = true;
    this.trabajos = [];
    this.holaMundo();
  }

  ngOnInit(){
    this.holaMundo();
    this.cambiarEdad(45);
    alert(this.nombre +" "+ this.edad)
  }

  cambiarEdad(edad:number){
    this.edad = edad;
  }

  holaMundo(){
    alert('Bienvenidos');
  }
}
