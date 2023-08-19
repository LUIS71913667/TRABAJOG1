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
        System.out.println("--------DIVICION--------");
        //CREAMOS LAS VARIABLES A USAR PARA LOS DATOS
        int e,f,divicion;
        //INGRESAMOS EL PRIMER NUMERO A DIVIDIR
        System.out.println("Digite el primer numero:");
        e=entrada.nextInt();
        //INGRESAMOS EL SEGUNDO NUMERO A DIVIDIR
        System.out.println("Digite el segundo numero:");
        f=entrada.nextInt();
        //CREAMOS LA VARIABLE QUE DIVIDIRA LOS DATOS
        divicion = e/f;
        //SALIDA DE LOS DATOS INGRESADOS Y SU RESULTADO
        System.out.println("EL RESULTADO DE ESTA DIVICION ES:  " + divicion);
    }
    
}
