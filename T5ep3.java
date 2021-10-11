/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5ep3;

/**
 *
 * @author David Arranz
 */
public class T5ep3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //parte de arriba(incluye el medio)
        String astr="*",esp=" ";
        int h=0;
        while(h<4){
            int y=0+h;
            while(y<3){
                System.out.print(esp);
                y++;
            }
        System.out.println(astr);
        astr=astr+"**";
        h++;
        }
        //parte de abajo
        astr="*";
        int y=0;
        int i=0;
        int j=0;
        int g=0;
        
        for(i=0;i<10;i=i+2){
            y=i;
            g++;
            while(j<g){
            System.out.print(esp);
            j++;
            }
            j=0;
            while(y<5){
        System.out.print(astr);
        y++;
            }
            
            System.out.print("\n");
        }
    }
    
}
