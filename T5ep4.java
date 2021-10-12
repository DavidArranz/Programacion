import java.util.Scanner;
public class T5ep4 {
	public static int lukynum(int num) {
		int c1=num/1000;
		int c2=(num-1000*c1)/100;
		int c3=((num-1000*c1-100*c2)/10);
		int c4=(num-1000*c1-100*c2-c3*10);
		int suma1=c1+c2+c3+c4;
		if (suma1<10) {
			return suma1;
			}
		else {
			c1=suma1/10;
			c2=suma1-c1*10;
			int suma2=c1+c2;
			return suma2;
		}
			
		
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia,mes,año,suma;
		System.out.println("Introduce la fecha de tu nacimiento en formato numerico");
		System.out.print("Dia: ");
		dia=sc.nextInt();
		System.out.print("Mes: ");
		mes=sc.nextInt();
		System.out.print("Año: ");
		año=sc.nextInt();
		suma=dia+mes+año;
		System.out.println("\nTu luky number es el "+lukynum(suma));
	}
}
