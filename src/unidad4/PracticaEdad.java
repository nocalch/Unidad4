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
public class PracticaEdad {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una Edad y luego el nombre de la persona");
        int edad1 = leer.nextInt();
        String nom1 = leer.next();
        System.out.println("Ingresa la segunda Edad y luego el nombre de la persona");
        int edad2 = leer.nextInt();
        String nom2 = leer.next();
        System.out.println("Ingresa la tercera Edad y luego el nombre de la persona");
        int edad3 = leer.nextInt();
        String nom3 = leer.next();
        System.out.println("Ingresa la cuarta Edad y luego el nombre de la persona");
        int edad4 = leer.nextInt();
        String nom4 = leer.next();
        
        if(edad1==edad2&&edad2==edad3&&edad3==edad4){
            System.out.println("Todas las edades son iguales: "+nom1+", "+nom2+", "+nom3+", "+nom4+" con edad"+edad1);
            //todos iguales
        }else if(edad1>edad2 && edad1>edad3 && edad1>edad4){
            System.out.println("La persona mas grande es: "+nom1 +"con edad: "+ edad1);
            //El primero es mayor
        }else if(edad2>edad1 && edad2>edad3 && edad2>edad4){
            System.out.println("La persona mas grande es: "+nom2 +"con edad: "+ edad2);
            //El segundo es mayor
        }else if(edad3>edad1 && edad3>edad2 && edad3>edad4){
            System.out.println("La persona mas grande es: "+nom3 +"con edad: "+ edad3);
            //El tercero es mayor
        }else if(edad4>edad1 && edad4>edad3 && edad4>edad2){
            System.out.println("La persona mas grande es: "+nom4 +"con edad: "+ edad4);
            //El cuarto es mayor
        }else if(edad2==edad1 && edad2>edad3 && edad2>edad4){
            System.out.println("Las personas mas grandes son: "+nom1+" y "+nom2 +"con edad: "+ edad2);
            //El mayor es 1 y 2
        }else if(edad2==edad3 && edad2>edad1 && edad2>edad4){
            System.out.println("Las personas mas grandes son: "+nom2+" y "+nom3 +"con edad: "+ edad2);
            //El mayor es 3 y 2
        }else if(edad2==edad4 && edad2>edad3 && edad2>edad1){
            System.out.println("Las personas mas grandes son: "+nom2+" y "+nom4 +"con edad: "+ edad2);
            //El mayor es 1 y 2
        }else if(edad1==edad3 && edad1>edad2 && edad1>edad4){
            System.out.println("Las personas mas grandes son: "+nom1+" y "+nom3 +"con edad: "+ edad1);
            //El mayor es 1 y 3
        }else if(edad1==edad4 && edad1>edad2 && edad1>edad3){
            System.out.println("Las personas mas grandes son: "+nom1+" y "+nom4 +"con edad: "+ edad1);
            //El mayor es 1 y 4
        }else if(edad3==edad4 && edad3>edad2 && edad3>edad1){
            System.out.println("Las personas mas grandes son: "+nom3+" y "+nom4 +"con edad: "+ edad3);
            //El mayor es 3 y 4
        }else if(edad1==edad2 && edad1==edad3 && edad1>edad4){
            System.out.println("Las personas mas grandes son: "+nom1+", "+nom2+" y "+nom3 +"con edad: "+ edad1);
            //El mayor es 1 y 2 y 3
        }else if(edad1==edad2 && edad1==edad4 && edad1>edad3){
            System.out.println("Las personas mas grandes son: "+nom1+", "+nom2+" y "+nom4 +"con edad: "+ edad1);
            //El mayor es 1 y 2 y 4
        }else if(edad1==edad3 && edad1==edad4 && edad1>edad2){
            System.out.println("Las personas mas grandes son: "+nom1+", "+nom3+" y "+nom4 +"con edad: "+ edad1);
            //El mayor es 1 y 3 y 4
        }else if(edad2==edad3 && edad2==edad4 && edad2>edad1){
            System.out.println("Las personas mas grandes son: "+nom2+", "+nom3+" y "+nom4 +"con edad: "+ edad2);
            //El mayor es 1 y 2 y 3
        }
    }
}
