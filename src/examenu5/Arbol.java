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
public class Arbol {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int contador=0;
        int pal=0;
        do{
            System.out.println("Ingrese una palabra");
            palabra= leer.next();
            if(palabra.equals("NAVIDAD")||palabra.equals("navidad")||palabra.equals("Navidad")){
                pal=1;
            }
            contador++;
        }while(pal!=1);
        System.out.println("Antes de la palabra se ingresaron: "+(contador-1));
    }
    
}
