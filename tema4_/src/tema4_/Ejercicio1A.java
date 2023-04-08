package tema4_;



public class Ejercicio1A {

	public static void main(String[] args) {

		ordenarNumeros(1000, 5, 60, "d");
	
	}

	public static void ordenarNumeros(int num1, int num2, int num3, String criterioOrden) {
		
		int numeroAuxiliar;
		int[] vector = {num1, num2, num3};
		
		if(criterioOrden.equalsIgnoreCase("a")){
			System.out.println("Ordenamiento Ascendente");
			if(vector[1] < vector[0]) {
				numeroAuxiliar = vector[0];
				vector[0] = vector[1];
				vector[1] = numeroAuxiliar;
			}
			if(vector[2] < vector[1]) {
				numeroAuxiliar = vector[1];
				vector[1] = vector[2];
				vector[2] = numeroAuxiliar;
			}
			if(vector[1] < vector[0]) {
				numeroAuxiliar = vector[0];
				vector[0] = vector[1];
				vector[1] = numeroAuxiliar;
			}
		}else{
			System.out.println("Ordenamiento Descendente");
			if(vector[1] > vector[0]) {
				numeroAuxiliar = vector[0];
				vector[0] = vector[1];
				vector[1] = numeroAuxiliar;
			}
			if(vector[2] > vector[1]) {
				numeroAuxiliar = vector[1];
				vector[1] = vector[2];
				vector[2] = numeroAuxiliar;
			}
			if(vector[1] > vector[0]) {
				numeroAuxiliar = vector[0];
				vector[0] = vector[1];
				vector[1] = numeroAuxiliar;
			}
			
		}
		
		System.out.println("Vector Ordenado ->\t\t" + vector[0] + " " + vector[1] + " " + vector[2]);
	}
	
	
}
