/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_factorial;

/**
 *
 * @author angel
 */
public class EVA3_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5;
        System.out.println("Factorial de 5 = " + calcularFactorial(valor));
        //CREAR METODO calcularPotencia(int base, int potencia) --> regresa entero
        
        int potencia = 3;
        int base = 2;
        System.out.println("La potencia de 5 = " + calcularPotencia(base, potencia));
    }
    
    public static int calcularFactorial(int valor){
        
        int guardar = 1;
        for (int i = 1; i <= valor; i++) {
            guardar *= i; // guardar = guardar * i;
        }
        return guardar;
        
    }
    
    public static int calcularPotencia(int base, int potencia){
    
        int resu = 1;
        for (int i = 1; i <= potencia; i++) {
            resu = resu * base;
            
        }
        return resu;
        
        
    }
    
}
