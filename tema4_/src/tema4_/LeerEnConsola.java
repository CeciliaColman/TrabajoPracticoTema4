package tema4_;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LeerEnConsola {

	public static void main(String[] args) {
		Integer vectorNumeros[] = {-2,20,30};
		
	        int n1, n2, n3;
	        Scanner scn = new Scanner(System.in);
	        System.out.print("Introduzca primer número: ");
	        n1 = scn.nextInt();
	        System.out.print("Introduzca segundo número: ");
	        n2 = scn.nextInt();
	        System.out.print("Introduzca tercer número: ");
	        n3 = scn.nextInt();
	        
	        int i=0;
	        
	        vectorNumeros[i] = n1;
	        
	        i++;
	        vectorNumeros[i] = n2;
	        i++;
	        vectorNumeros[i] = n3;       
		
		
	        System.out.println("Numeros en el vector:");
	        
			for(int numero : vectorNumeros) {
				System.out.print(numero + " ");
			}
			
			/*ORDENAMIENTO DEL VECTOR*/
			boolean ascendente = true; 
			
			System.out.println("Ejercicio 1 B Tema 4");
			
			if (ascendente) {
				Arrays.sort(vectorNumeros);
			}else {
				Arrays.sort(vectorNumeros, Collections.reverseOrder());
			}
			
			for (int elemento : vectorNumeros) {
				System.out.println(elemento);
				
			}
		
		scn.close();
	}

}