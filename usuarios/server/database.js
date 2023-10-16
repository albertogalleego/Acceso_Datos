const mongoose=require ('mongoose');
const uri= 'mongodb://127.0.0.1:27017/mean-crud';

mongoose.connect(uri)
    .then (db=> console.log('La BD esta conectada') )//nos dice si conecto a la base de datos
    .catch(err=>console.error(err));

    module.exports=mongoose;

