/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ep1;

/**
 *
 * @author David Arranz
 */
public class T5ep1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1,b=2,c=3,mayor=0,menor=0;
        
        //Suponemos que el mayor es el primero
        // Ciclo comienza en 1 porque el 0 ya está contemplado
        if (a>b && a>c)
            mayor=a;
        else if (b>a && b>c)
            mayor=b;
                    else if(c>b && c>a)
                        mayor=c;
        if (a<b && a<c)
            menor=a;
        else if (b<a && b<c)
            menor=b;
                    else if(c<b && c<a)
                        menor=c;
        System.out.println("el mayor es "+ mayor +" y el menor es "+ menor );
            
    }
    
}
