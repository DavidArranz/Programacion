package t5ep7;
import java.util.*;
public class T5ep7 {
	public static String int_a_romano(int numint){
		int M,D,C,L,X,V,I;
		String sM="M",sD="D",sC="C",sL="L",sX="X",sV="V",sI="I";
		String numromano="";
		//Esto es para obtener el n de letras que usaremos de cada
		M=numint/1000;
		numint=numint%1000;
		
		D=numint/500;
		numint=numint%500;
		
		C=numint/100;
		numint=numint%100;
		if(D==1 && C==4) {
			sC="CM";
			D=0;
			C=1;
		}
		else if(C==4) {
			sC="CD";
			C=1;
		}
		
		L=numint/50;
		numint=numint%50;
		
		X=numint/10;
		numint=numint%10;
		if(L==1 && X==4) {
			sX="XC";
			L=0;
			X=1;
		}
		else if(X==4) {
			sX="XL";
			X=1;
		}
		
		V=numint/5;
		numint=numint%5;
		
		I=numint/1;
		numint=numint%1;
		if(V==1 && I==4) {
			sI="IX";
			V=0;
			I=1;
		}
		else if(I==4) {
			sI="IV";
			I=1;
		}
		
		String[] nromanos= {sM,sD,sC,sL,sX,sV,sI};
		int[] numero_de_numeros_romanos= {M,D,C,L,X,V,I};
		//para imprimir las letras necesarias
		int x;
		int y=0;
		for(String i : nromanos) {
			x=numero_de_numeros_romanos[y];
			while(x>0) {
				numromano=numromano+i;
			x--;
			}
		y++;	
		}
		
		return numromano;
		
	}
	public static void main(String[] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("introduzca el num (max 3999): ");
		int num=sc.nextInt();
		if (num>3999||num<0) {
			System.out.print("el numero tiene que ser del 0 al 3999");
		}
		else {
			System.out.print(num+" en romano es "+int_a_romano(num));
	
		}
	}
}