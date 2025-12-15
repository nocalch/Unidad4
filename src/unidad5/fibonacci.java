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
public class fibonacci {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres de la serie?");
        int digitos = leer.nextInt();
        int nm = 0;
        int nm2= 1;
        for (int i=0;i<=digitos;i++){
            nm = nm+nm2;
            System.out.println(nm);
            nm2++;
        }
    }
}
