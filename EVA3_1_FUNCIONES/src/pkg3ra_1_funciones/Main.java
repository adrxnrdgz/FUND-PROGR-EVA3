/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3ra_1_funciones;

/**
 *
 * @author angel
 */
public class Main {

    public static void main(String[] args) {
        //LLAMADA A FUNCION O PROCEDIMIENTO
       imprimirMensaje("Hola mundo!!!", 5);
    }
    
    public static void imprimirMensaje(String mensaje, int cant){
        for (int i = 0; i < cant; i++) 
            System.out.println(mensaje);
    }
    
}
