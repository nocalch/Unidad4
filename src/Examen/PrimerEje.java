/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;
import java.util.Scanner;
public class PrimerEje {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cual es el precio del boleto en primera?");
        double primera = leer.nextDouble();
        
        double segunda = primera-(primera*0.30);
        
        double total = primera*2+segunda*3;
        
        System.out.println("EL totsl a pagar es:"+total);
    }
}
