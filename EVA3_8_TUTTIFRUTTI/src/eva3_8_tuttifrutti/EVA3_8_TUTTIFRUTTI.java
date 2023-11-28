/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_tuttifrutti;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVA3_8_TUTTIFRUTTI {
    
    static final String USUARIO = "TUTTI";
    static final String PWD = "FRUTTI";
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        String usu;
        String pwd;
        
        do{
            //preguntar usuario y contraseña
            usu = capturaDatos("Usuario: ");
            pwd = capturaDatos("Contraseña: ");
           
        }while(!validarUsuario(usu, pwd));
        System.out.println("BIENVENIDO AL SISTEMA!!!");
        
    }
    
    public static boolean validarUsuario(String usuario, String pwd){
    
        if(usuario.equals(USUARIO)  && (pwd.equals(PWD)))
            return true;
        else
            return false;
        
    }
    
    public static String capturaDatos(String mensaje){
        
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextLine();
        
    }
    
}
