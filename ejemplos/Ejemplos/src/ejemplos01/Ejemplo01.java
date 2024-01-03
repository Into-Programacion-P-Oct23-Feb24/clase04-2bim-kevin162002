/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //String miCiudad = obtenerCiudadMayuscula("Loja");
        //System.out.printf("%s\n", miCiudad);
        obtenerMultiplicacion(7,50);
        // El primer metodo que vimos fue un procedimeinto 
        // que mediante el metodo no sirvio para presentar una tabla
        
    }

    public static String obtenerCiudadMayuscula(String m) {
        String m2 = m.toUpperCase();
        return m2;
    }

    public static void obtenerMultiplicacion(int tabla, int limite) {
        // void significa que no retorna nada
        int multiplicacion;
        String cadenaFinal = "";
        for (int i = 1; i <= limite; i++) {
            multiplicacion = tabla * i;
            cadenaFinal = String.format("%s%d * %d = %d\n", 
                    cadenaFinal,
                    tabla,
                    i,
                    multiplicacion);
            
        }
        System.out.printf("%s\n", cadenaFinal);
    }
   
    public static String obtenerNombre() {
        return "Luis";
    }

}
