package tema4_;

import java.util.Scanner;

//import java.util.Scanner;

public class Ejercicio1B {

	public static void main(String[] args) {
		
		ordenarNumeros();
		
	}
	
public static void ordenarNumeros() {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese numeroA: ");
		int num1 = entrada.nextInt();
		System.out.print("Ingrese numeroB: ");
		int num2 = entrada.nextInt();
		System.out.print("Ingrese numeroC: ");
		int num3 = entrada.nextInt();
	
		System.out.print("Ingrese orden [ a / d]: ");
		String criterio = entrada.next();	
		
		Ejercicio1A.ordenarNumeros(num1, num2, num3, criterio);
		
		entrada.close();
		
	}

}