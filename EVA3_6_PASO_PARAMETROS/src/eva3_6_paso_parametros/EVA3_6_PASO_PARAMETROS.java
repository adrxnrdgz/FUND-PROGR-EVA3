/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_paso_parametros;

/**
 *
 * @author angel
 */
public class EVA3_6_PASO_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 5;
        System.out.println("El valor de x en el main() es de: " + x);;
        pasoPorValor(x);
        System.out.println("El valor de x en el main() después de la llamada es de: " + x);
    }
    
    //EN EL PASO POR VALOR DE ARGUMENTOS, SE ENVIA UNA COPIA AL METODO
    public static void pasoPorValor(int valor){
        
        System.out.println("El valor que recibo en el método es de: " + valor);
        valor++;
        System.out.println("El valor modificado en el método es de: " + valor);
                
        
        
        
    
    }
}
