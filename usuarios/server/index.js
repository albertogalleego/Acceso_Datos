const express = require('express');
const app = express();
const morgan = require ('morgan');
const {mongoose}=require('./database'); //aqui hacemos la conexion a mongoose

/*app.listen(3000,() =>{
    console.log ('Server3000')})*/
//settings

app.set('port',process.env.PORT || 3000);
app.listen(app.get('port'),()=>{
    console.log("serv eject en 3000",app.get('port'))});


//midelware
app.use(morgan('dev'));
app.use(express.json());


//routes

//iniciar