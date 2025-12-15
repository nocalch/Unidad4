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
public class foreje {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas = leer.nextInt();
        for (int i = 0;i<=filas;i++){
            for(int j =0;j<1;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
