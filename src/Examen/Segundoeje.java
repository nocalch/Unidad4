/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;
import java.util.Scanner;

/**
 *
 * @author Lab3
 */
public class Segundoeje {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el numero de entrada");
        double x = leer.nextDouble();
        
        double prim = (((x + x*x)/(5*x+3))+x);
        double sec = ((x + x*x)/(5*x+3))/(((x + x*x)/(5*x+3))+2*x);
        double res =  prim*sec;
        
        System.out.println("El resultado es "+res);
    }
}
