import java.util.Scanner;


public class Bhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
        int a, b, c;
		
		System.out.println("ingrese el valor de a: ");
		a = teclado.nextInt();
		
		System.out.println("ingrese el valor de b:");
		b = teclado.nextInt();
		
		System.out.println("ingrese el valor de c:");
		c = teclado.nextInt();
		
		
		bhaskara (a, b, c);
		
	

	}
	
	// 4ac
	
	static int primerPaso(int a, int c) {
		
		return 4*a*c;
	}
	
	// b2
	
	static double segundoPaso (int b) {
		
	   return Math.pow(b, 2);
	}
	
	// -b
	
	static int bNegativo (int b) {
		
		return 0-b;
	}
	
	//2a
	static double sextoPaso (int a) {
		
		return 2*a;
	}
	
	// b2 - 4ac 
	static double tercerPaso (int a, int b, int c) {
		
		return segundoPaso (b) - primerPaso (a, c);
	}
	
	//√(b2 - 4ac)
	
	static double cuartoPaso (int a, int b, int c) {
		
		return Math.sqrt(tercerPaso(a, b, c));
	}
	
	// -b + √(b2 - 4ac)
	
	static double caminoSuma (int a, int b, int c) {
		
		return (bNegativo (b) + cuartoPaso (a, b, c));
	}
	
	// -b + √(b2 - 4ac) / 2a
	
	static double resultadoX1 (int a, int b, int c) {
		
		return (caminoSuma (a, b, c)/sextoPaso(a));
	}
	
	//-b - √(b2 - 4ac)
	static double caminoResta (int a, int b, int c) {
		
		return (bNegativo (b) - cuartoPaso (a, b, c));
	}
			
	// -b - √(b2 - 4ac) / 2a
	
	static double resultadoX2 (int a, int b, int c) {
			
		return (caminoResta (a, b, c)/sextoPaso(a));
	}
	

	static void bhaskara (int a, int b, int c) {
		
		System.out.println("el valor de x1 es:" + resultadoX1 (a, b, c));
		System.out.println("el valor de x2 es:" + resultadoX2 (a, b, c));
	}

	
}
