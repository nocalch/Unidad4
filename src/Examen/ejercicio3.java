/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;
import java.util.Scanner;
/**
 *
 * @author Lab3
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba las horas trabajadas");
        double horast = leer.nextDouble();
        
        System.out.println("Escriba el salario por hora");
        double horassala = leer.nextDouble();
        
        double salario = horast*horassala;
        
        double despensa = salario*0.18;
        double puntualidad = salario*0.10;
        double compensacion = salario*0.12;
        
        double sindical = salario*0.2;
        double isr = salario*0.16;
        double medico = salario*0.5;
        
        double total = salario+despensa+puntualidad+compensacion-sindical-isr-medico;
        
        System.out.println("El total es "+total);
    }
}
