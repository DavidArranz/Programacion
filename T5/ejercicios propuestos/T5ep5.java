package t5ep5;

public class T5ep5 {
	public static void main(String[] args) {
		for(int i=1;i<11;i++) {
			System.out.println("Tabla del "+i);
			System.out.println("*************");
			for(int m=0;m<10;m++) {
				int r=i*m;
				System.out.println(i+"x"+m+" = "+r);
			}
			System.out.println("\n");
		}
	}
}
