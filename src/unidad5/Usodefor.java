/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5;
import java.util.Scanner;
/**
 *
 * @author Lab3
 */
public class Usodefor {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int edad;
        do {            
            System.out.println("Ingrese edad");
            edad = leer.nextInt();
        } while (edad < 10|| edad>120);
    }
}
