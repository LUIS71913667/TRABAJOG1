/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones.de.prueba;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class OPERACIONESDEPRUEBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------MULTIPLICACION--------");
        //CREAMOS LAS VARIABLES A USAR PARA LOS DATOS
        int g,h,multiplicacion;
        //INGRESAMOS EL PRIMER NUMERO A MULTIPLICAR
        System.out.println("Digite el primer numero:");
        g=entrada.nextInt();
        //INGRESAMOS EL SEGUNDO NUMERO A MULTIPLICAR
        System.out.println("Digite el segundo numero:");
        h=entrada.nextInt();
        //CREAMOS LA VARIABLE QUE MULTIPLICARA LOS DATOS
        multiplicacion = g*h;
        //SALIDA DE LOS DATOS INGRESADOS Y SU RESULTADO
        System.out.println("EL RESULTADO DE ESTA MULTIPLICACION ES:  " + multiplicacion);
    }
    
}
