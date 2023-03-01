/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javamongo;


import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mongodb.BasicDBObject;


/**
 *
 * @author Axelt
 */
public class Connection {
    DB BaseDatos;
    DBCollection coleccion;
    BasicDBObject document = new BasicDBObject();
    
    
    public Connection(){
        
//        try {
//    MongoClient mongoClient = new MongoClient("localhost", 27017);
//    MongoDatabase database = mongoClient.getDatabase("Actividad502");
//    MongoCollection<org.bson.Document> coleccion = database.getCollection("Actividad502");
//    System.out.println("Conexion Exitosa");
//} catch (Exception ex) {
//    Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
//}
        
        try {
            Mongo mongo = new Mongo("localhost", 27017);
            BaseDatos = mongo.getDB("Actividad502");
            coleccion = BaseDatos.getCollection("Actividad502");
            System.out.println("Conexion Exitosa");
        } catch(Exception ex) {            
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,null,ex);
        }        
    }
    
    //Metodos del CRUD 
    
    //Insercion de Datos
    
    public boolean insertar(String accion){
        
        document.put("accion", accion);
        coleccion.insert(document);              
        return true;        
    }
    
    //Mostrar Datos 
    
    public void mostrar(){
       DBCursor cursor = coleccion.find();       
       while(cursor.hasNext()){
           System.out.println(cursor.next());           
       }
    }
    
    //Metodo para Actualizar
    
    public boolean actualizar(String accionVieja, String accionNueva){
        
        document.put("accion", accionVieja);
        BasicDBObject documentNuevo = new BasicDBObject();
        documentNuevo.put("accion", accionNueva);
        coleccion.findAndModify(document, documentNuevo);               
        return true;
    }    
    //Metodo de Eliminar 
    
    public boolean eliminar(String accion){
        document.put("accion", accion);
        coleccion.remove(document);
        return true;
    }
}