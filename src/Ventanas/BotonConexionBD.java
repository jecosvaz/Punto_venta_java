package Ventanas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iocv
 */
public class BotonConexionBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ConexionBD conec = new ConexionBD();
            
        if (conec.getConexionBD()!=null){ 
            
            System.out.println("Conectado");
            
        }else{
            System.out.println("Error en la conexion ");
        
        }
        
    }
}
