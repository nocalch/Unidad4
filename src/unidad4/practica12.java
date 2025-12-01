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
public class practica12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el peso en gramos");
        int peso = leer.nextInt();
        int total;
        if(peso<5000&&peso>0){
            System.out.println("1  America del norte $11");
            System.out.println("2  America central $10");
            System.out.println("3  America deñ sur $12");
            System.out.println("4  Europa $24");
            System.out.println("5  Asia $27");
            System.out.println("Cual es su zona horaria? (1-5)");
            int zonaH = leer.nextInt();
            
            //Swich para ver el precio
            switch (zonaH){
                case 1:
                    total = peso*11;
                    System.out.println("El total a pagar es: "+"$"+total);
                    break;
                    
                case 2:
                    total = peso*10;
                    System.out.println("El total a pagar es: "+total);
                    break;
                    
                case 3:
                    total = peso*12;
                    System.out.println("El total a pagar es: "+total);
                    break;
                
                case 4:
                    total = peso*24;
                    System.out.println("El total a pagar es: "+total);
                    break;
                    
                case 5:
                    total = peso*27;
                    System.out.println("El total a pagar es: "+total);
                    break;
                    
                default:
                    System.out.println("No enviamos a ese lugar");
                    break;
            }
        }else{
            System.out.println("Ese peso no se puede enviar");
        }
    }
}
