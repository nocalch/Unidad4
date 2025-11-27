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
public class Promedio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c1,c2,c3,prom;
        System.out.println("Escribe 3 calificaciones ");
        c1=leer.nextInt();
        c2=leer.nextInt();
        c3=leer.nextInt(); 
        
        prom=(c1+c2+c3)/3;
        
        if(prom>=70){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
        
    }
}
