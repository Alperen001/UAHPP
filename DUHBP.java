import java.util.Scanner;
public class DUHBP {

	public static void main(String[] args) {
		int a, b,c,alan;
		double d;
		Scanner inp = new Scanner(System.in);
		System.out.println("1.Kenar� Giriniz");
		a=inp.nextInt();
		System.out.println("2.Kenar� Giriniz");
		b=inp.nextInt();
		System.out.println("3.Kenar� Giriniz");
		c=inp.nextInt();
		int u = (a + b + c) / 2;
        alan = (int) Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("��genin alan� = " + alan);  
		
		d= Math.sqrt((a*a)+(b*b));
		System.out.println("Hipoten�s : " + d);
	

	}

}
