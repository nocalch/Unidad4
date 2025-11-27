/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
        
package Unidad3;

import java.util.Scanner;
/**
 *
 * @author Lab3
 */
public class Ejemplo1Modulo {
    public static void main(String[] args){
         boolean res;
         
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Escribe el primer numero");
         int a = leer.nextInt();
         
         res = a%2==0;
         
         System.out.println("El numero es par?"+res);
    
    }
}
