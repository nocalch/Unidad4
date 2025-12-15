/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab3
 */import java.util.Scanner;
public class pract5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0, estatura=1, suma=0;
        double promedio = 0;
        while (estatura>0){
            System.out.println("estatura");
            estatura = leer.nextInt();
            suma = suma + estatura;
            contador = contador +1;
            
        }
        promedio = suma/contador;
        System.out.println("promedio" + promedio);
    }
}
