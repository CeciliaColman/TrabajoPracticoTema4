package tema4_;

import java.util.Scanner;

import tema4_.ManejoCodificacionString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String eleccion = "";
		int desplazamiento = 0;
		String archivoEntrada;
		String archivoSalida;
		String rutaEntrada;
		String rutaSalida;
		String fraseProcesada = "";
		
		while(!eleccion.equalsIgnoreCase("c") && !eleccion.equalsIgnoreCase("d")){
			System.out.print("Ingrese una opción; Codificacion o Decodificacion? [C o D]: ");
			eleccion = entrada.nextLine();
		}
		
		System.out.print("Desplazamiento: ");
		desplazamiento = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Archivo entrada [.txt]: ");
		entrada.reset();
		archivoEntrada = entrada.nextLine();
		
		rutaEntrada = "src/tema4_/" + archivoEntrada + ".txt";
		System.out.println(rutaEntrada);
		Path archivoAProcesar = Paths.get(rutaEntrada);
		System.out.println(archivoAProcesar.toAbsolutePath());
		System.out.println(Files.exists(archivoAProcesar));
		
		System.out.print("Archivo salida [.txt]: ");
		archivoSalida = entrada.nextLine();
		entrada.close();
		rutaSalida = "src/tema4_/" + archivoSalida + ".txt";
		Path archivoResultante = Paths.get(rutaSalida);
		
		String frasesAProcesar = "";
		
		try {
			for(String fila : Files.readAllLines(archivoAProcesar)) {
				frasesAProcesar = frasesAProcesar + fila + "\n";
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		if(eleccion.equalsIgnoreCase("C")) {
			fraseProcesada = ManejoCodificacionString.dezplazarCaracter(frasesAProcesar, desplazamiento);
		}else {
			fraseProcesada = ManejoCodificacionString.dezplazarCaracter(frasesAProcesar, desplazamiento * (-1));
		}
		
		try {
			Files.createFile(archivoResultante);
			Files.writeString(archivoResultante, fraseProcesada);
		} catch (IOException e) {
		
			e.printStackTrace();
		}

		if(Files.exists(archivoResultante)) {
			System.out.println("El Proceso fue exitoso");
		}else {
			System.out.println("Algo salio mal.");
		}
	}

}
