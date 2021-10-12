package t5ep6;
import java.util.*;
public class T5ep6 {
	public static void main(String[] arg) {
		Random rnd = new Random();
		int valor=200+rnd.nextInt(100);
		if(valor%2==1) {
			System.out.println(valor+" es impar");
		}
		else {
			System.out.println(valor+" es par");
		}
	}
}
