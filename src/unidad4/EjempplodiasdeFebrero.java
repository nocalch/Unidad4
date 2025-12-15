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
public class EjempplodiasdeFebrero {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa 4 Años del 1000 al 3000");
        int a1= leer.nextInt();
        int bis1;
        int a2= leer.nextInt();
        int bis2;
        int a3= leer.nextInt();
        int bis3;
        int a4= leer.nextInt();
        int bis4;
        
        if(1000<=a1&&a1<=3000&&1000<=a2&&a2<=3000&&1000<=a3&&a3<=3000&&1000<=a4&&a4<=3000){
            boolean b1 = (a1 % 400 == 0) || (a1 % 4 == 0 && a1 % 100 != 0);
            boolean b2 = (a2 % 400 == 0) || (a2 % 4 == 0 && a2 % 100 != 0);
            boolean b3 = (a3 % 400 == 0) || (a3 % 4 == 0 && a3 % 100 != 0);
            boolean b4 = (a4 % 400 == 0) || (a4 % 4 == 0 && a4 % 100 != 0);
            if (b1==true){
                bis1 = 29;
            }else{
                bis1 = 28;
            }
            if (b2==true){
                bis2 = 29;
            }else{
                bis2 = 28;
            }
            if (b3==true){
                bis3 = 29;
            }else{
                bis3 = 28;
            }
            if (b4==true){
                bis4 = 29;
            }else{
                bis4 = 28;
            }
            System.out.println("Febrero tendra:"+bis1+bis2+bis3+bis4);
        
        }
    }
}
