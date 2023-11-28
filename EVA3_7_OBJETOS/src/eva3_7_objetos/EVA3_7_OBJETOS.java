/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_objetos;

/**
 *
 * @author angel
 */
public class EVA3_7_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona perso1 = new Persona();
        System.out.println(perso1);
        perso1.nombre = "Juan";
        perso1.apellido = "Perez";
        perso1.edad = 10;
        imprimirPersonas(perso1);
        
        Persona perso2 = new Persona();
        System.out.println(perso2);
        perso2.nombre = "Pedro";
        perso2.apellido = "Páramo";
        perso2.edad = 70;
        imprimirPersonas(perso2);
        
    }
    
    public static void imprimirPersonas(Persona perso){
        
        System.out.println("Direccion: " + perso);
        System.out.println("Nombre completo: " + perso.nombre + " " + perso.apellido);
        System.out.println("Edad: " + perso.edad);


    }
    
}

//DEFINEN UNA PLANTILLA PARA CREAR OBJETOS
//CREAN UN NUEVO TIPO DE DATOS
class Persona{
    
    String nombre;
    String apellido;
    int edad;
    
    
}
