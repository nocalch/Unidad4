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
public class ejercicios {
    //WHILE
    /*public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        
        int c = 1;
        int suma =1;
        int total = 0;
        while(c<11){
            System.out.println("Ingresa el numero "+c);
            suma = leer.nextInt();
            total=total+suma;
            c++;
        }
        System.out.println("el total es: "+total);
    }*/
    
    //DO WHILE
    /*public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        int c=1;
        int suma;
        int total =0;
        do {
            System.out.println("Ingresa el numero"+c);
            suma = leer.nextInt();
            total=total+suma;
            c++;
        } while (c<11);
        System.out.println("El total es: "+total);
    }*/
    
    //For
    /*public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int sumat =0;
        int num;
        for(int i=1; i<=10;i++){
            System.out.println("ingrese el numero "+i);
            num = leer.nextInt();
            
            sumat = sumat+num;
            
        }
        System.out.println("la suma da como resultado = "+sumat);
    }*/
    
    //Practica promedio
    /*public static void main(String[] args) {
        System.out.println("Ingrese cuantos alumnos tiene");
        Scanner leer=new Scanner(System.in);
        
        int contador;
        contador = leer.nextInt();
        int paso =0;
        int edad;
        int sumat =0;
        while(paso<contador){
            System.out.println("Ingresa la edad del niño"+(paso+1));
            edad = leer.nextInt();
            
            sumat = sumat+edad;
            paso++;
        }
        System.out.println("el resultado es:"+(sumat/paso));
    }*/
    
    //Edad Promedio
    /*public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la estatura 1");
        float estatura = leer.nextFloat();
        float sumatoria = estatura;
        int contador = 1;
        while(estatura>0){
            System.out.println("Ingrese la estatura "+(1+contador));
            estatura= leer.nextFloat();
            sumatoria = sumatoria+estatura;
            contador++;
        }
        System.out.println("el contador es"+(contador-1));
        System.out.println("El resultado es:"+(sumatoria/(contador-1)));
    }*/
    
    //
}
