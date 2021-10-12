/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ep8;
import java.util.*;
/**
 *
 * @author Carlos Povill
 */
public class T5ep8 {

    /**
     * @param args the command line arguments
     */
    
    public static boolean numprimo(int num){
        if (num == 0 || num == 1 || num == 4) {
          return false;
        }
        for (int x = 2; x < num / 2; x++) {
          if (num % x == 0)
            return false;
        
        }
        return true;
        }
    public static boolean numalreves(int numero){
        int cifra, inverso = 0;
        while(numero!=0){
            cifra = numero%10;
            inverso = (inverso * 10) + cifra;
            numero/=10;
        }
        if(numprimo(inverso)==false)
        return false;
        else
        return true;
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("introduce el numero parta saber si es omirp: ");
        num=sc.nextInt();
        if(numprimo(num)==false){
        System.out.println(num+" no es omirp");
        }
        else{
            if(numalreves(num)==false)
                System.out.println(num+" no es omirp");
            else{
            System.out.println(num+" si es omirp");
            }
        }
    }   
    
}
