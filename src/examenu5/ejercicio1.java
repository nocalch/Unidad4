/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenu5;
import java.util.Scanner;
/**
 *
 * @author Lab3
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma=0;
        System.out.println("Ingresa el numero por el que quiera empezar");
        int com = leer.nextInt();
        
        System.out.println("Ingresa el numero por el que quiera terminar");
        int ter  = leer.nextInt();
        
        while(com<=ter){
            if(com%5==0){
                System.out.println(com);
                suma=suma+com;
                com++;
            }else{
                com++;
            }
        }System.out.println("la suma es: "+suma);
        
    }
}
