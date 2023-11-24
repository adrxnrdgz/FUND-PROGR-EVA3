/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2__maximo;

/**
 *
 * @author angel
 */
public class EVA3_2__MAXIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamada a funcion (invocar funcion)
        //utilizar el valor directamente de la funcion
        System.out.println(buscarMaximo(100,200));
        //guardar el valor y usarlo despues
        int resu = buscarMaximo(100,200);
        System.out.println(resu);
        //llamar a la funcion e ignorar el resultado
        buscarMaximo(100,200);
        
    }
    
    public static int buscarMaximo(int val1, int val2){
        
        /*if(val1 > val2)
            return val1;
        else
            return val2;*/
        
        int resultado;
        if(val1 > val2)
            resultado = val1;
        else
            resultado = val2;
        
        return resultado;
        
    }
}
