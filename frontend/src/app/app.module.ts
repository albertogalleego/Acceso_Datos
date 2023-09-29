import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CiudadesComponent } from './ciudades/ciudades.component';
import { PaisesComponent } from './paises/paises.component';
import { FrutasComponent } from './frutas/frutas.component';
import { EmpleadoComponent } from './empleado/empleado.component';

@NgModule({
  declarations: [
    AppComponent,
    CiudadesComponent,
    PaisesComponent,
    FrutasComponent,
    EmpleadoComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
