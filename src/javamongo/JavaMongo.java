/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamongo;

/**
 *
 * @author Axelt
 */
public class JavaMongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection con = new Connection();                                    
        con.mostrar();
        System.out.println("---------------------------------------------");
        System.out.println("Se realizara una insercion a la Base de Datos");
        System.out.println("---------------------------------------------");
        con.insertar("Nadar");        
        System.out.println("---------------------------------------------");
        System.out.println("Insercion realizada con Exito");        
        System.out.println("---------------------------------------------");
        con.mostrar();
        System.out.println("---------------------------------------------");
        System.out.println("Se realizara una actualizacion a los datos ya existentes");
        System.out.println("--------------------------------------------");
        con.actualizar("Nadar", "Bucear");         
        System.out.println("--------------------------------------------");
        System.out.println("Los Datos se Actualizaron de manera Correcta");
        System.out.println("--------------------------------------------");
        con.mostrar();
        System.out.println("--------------------------------------------");
        System.out.println("Se realizara una eliminacion en la base de datos");
        System.out.println("--------------------------------------------"); 
        con.eliminar("Saltar");
        con.mostrar();
        System.out.println("--------------------------------------------");  
        System.out.println("Has terminado de usar la Aplicacion, Adios"); 
    }
    
}
