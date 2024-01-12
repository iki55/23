package proekt_32;

	import java.util.Scanner;
	public class Izlez {
		public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Vnesi strana a");
	double a =input.nextDouble();
		System.out.println("Vnesi strana b");
		double b =input.nextDouble();
		System.out.println("Vnesi strana c");
		double c =input.nextDouble();
	Vlez z=new Vlez(a,b,c);
	if(z.rezultat()) {
		System.out.println("Postoi triagolnik so zadadenite strani");
	if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b) {
		System.out.println("I triagolnikot e pravoagolen"+"\n");
	}
	else if(a*a<b*b+c*c && b*b<a*a+c*c && c*c<a*a+b*b) 
		System.out.println("I triagolnikot e ostroagolen"+"\n");

	else 
		System.out.println("I triagolnikot e tapoagolen"+"\n");
	}
	else  
		System.out.println("Ne postoi takov triagolnik so dadenite strani");
	}
	}
