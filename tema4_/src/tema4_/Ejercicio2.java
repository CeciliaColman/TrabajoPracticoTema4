package tema4_;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la ruta del Archivo: ");
		String nombreArchivo = entrada.nextLine();
		
		String ruta = "src/tema4_/" + nombreArchivo + ".txt";
		Path rutaRelativa = Paths.get(ruta);
		System.out.println("Ruta absoluta del archivo:");
		System.out.println(rutaRelativa.toAbsolutePath());
		
		if(Files.exists(rutaRelativa)) {
			System.out.println("Archivo existe, será reemplazado.");
		}else {
			System.out.println("Archivo NO existe.");
		}
		
		System.out.println("Ingrese numeros separados por \"-\"");
		String numeros = entrada.nextLine();
		String conSaltos = numeros.replace("-", "\n");
		
		if(!(conSaltos.endsWith("\n"))) {
			conSaltos = conSaltos + "\n";
		}

		try {
			Files.deleteIfExists(rutaRelativa);
			Files.createFile(rutaRelativa);
			Files.write(rutaRelativa, conSaltos.getBytes());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Excepcion");
			e.printStackTrace();
		}
		
		System.out.println("Ingrese más numeros separados por \"-\"");
		numeros = entrada.nextLine();
		conSaltos = numeros.replace("-", "\n");
		
		if(!(conSaltos.endsWith("\n"))) {
			conSaltos = conSaltos + "\n";
		}
		
		try {
			Files.write(rutaRelativa, conSaltos.getBytes(), StandardOpenOption.APPEND);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Ingrese 1 para  Sumar o 2 para Multiplicar: ");
		int eleccion = entrada.nextInt();
		
		entrada.close();
		
	
		try {
			int resultado;
			int numeroActual;
			if(eleccion == 1) {
				resultado = 0;
			}else {
				resultado = 1;
			}
			
			for(String fila : Files.readAllLines(rutaRelativa)) {
				System.out.println(fila);
				numeroActual = Integer.parseInt(fila);
				if(eleccion == 1) {
					resultado += numeroActual;
				}else {
					resultado *= numeroActual;
				}
			}
			System.out.println("El resultado es:  " + resultado);
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
}
