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
public class collatz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Que numero quiere: ");
        int n = leer.nextInt();
        if(n>1){
            do{
            System.out.println(n);
            if(n%2==0){
                n=n/2;
            }else{
                n=(n*3)+1;
            }
            
        }while(n>1);
        System.out.println("1");
        }else{
            System.out.println("1");
        }
        
    }
}
