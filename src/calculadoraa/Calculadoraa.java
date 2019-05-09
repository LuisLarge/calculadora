/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraa;

/**
 *
 * @author Estudiante
 */

import java.util.Scanner;

public class Calculadoraa {

    private static String division;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero1 = 0;
        int numero2 = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        numero1 = reader.nextInt();
        System.out.println("ingrese el segundo numero");
        numero2 = reader.nextInt();
        
        
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        
        
         try {

	double division = numero1 / numero2;

       } catch (ArithmeticException ex) {

	numero2 = 0;
        System.out.println("ERROR");

       } finally {
            
   

	 System.out.println("La division es " + numero1 + " / " + numero2 + " = " + division);


        
        
        
       
      
    } 
       
        
        System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("La resta suma es " + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("La multiplicacion es " + numero1 + " * " + numero2 + " = " + multiplicacion);
      
    }
    
}
