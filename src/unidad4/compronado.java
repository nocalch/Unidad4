/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad4;
import java.util.Scanner;
/**
 *
 * @author Lab3
 */
public class compronado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        
        if (num1 == 0){
            System.out.println("El numero es 0");
        }else if(num1<0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("EL numero es positivo");
        }
    }
}
