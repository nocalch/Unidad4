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
public class Practica1 {
    
    public static void main(String[] args) {
        
        //definir
        int num1,num2,res;
        
        //enrrada
        Scanner leer = new Scanner(System.in);
        System.out.println("dame un numero");
        num1=leer.nextInt();
        System.out.println("dame otro numero");
       num2=leer.nextInt();

        //proceso
        res= num1+num2;
        //salida
        System.out.println("el resultado es: "+res);
        
    }
    
    
}
