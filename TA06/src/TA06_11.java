import java.util.Scanner;

public class TA06_11 {

	public static void main(String[] args) {
		int tamArr1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array");
		tamArr1 = sc.nextInt();
		sc.close();
		
		int[] array1 = new int[tamArr1];
		rellenarValores(array1);
		int[] array2 = array1.clone();		//usar .clone() para pasar por valor
		rellenarValores(array2); 			
		
		int [] arrayNuevo = productoArrays(array1, array2);
		System.out.println("Mostrando los valores de array1");
		mostrarValores(array1);
		System.out.println("Mostrando los valores de array2");
		mostrarValores(array2);			
		System.out.println("Mostrando los valores del array de multiplicación");
		mostrarValores(arrayNuevo);
	}
	
	private static void rellenarValores(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*100);	//generar numero aleatorio de 0 a 99
		}
	}
	
	private static int[] productoArrays(int[] array1, int[] array2) {
		int[] arrayProd;
		arrayProd = new int[array1.length];	
		for(int i = 0; i < array1.length; i++) 
			arrayProd[i] = array1[i] * array2[i];
		
		/*Codigo para usar arrays de tamaño diferente, como ahora son iguales no hace falta
		if(array1.length<array2.length) {
			arrayProd = new int[array1.length];	//El array nuevo tiene el tamaño del mas pequeño
			for(int i = 0; i < array1.length; i++) 
				arrayProd[i] = array1[i] * array2[i];
		} else {
			arrayProd = new int[array2.length];	//El array nuevo tiene el tamaño del mas pequeño
			for(int i = 0; i < array2.length; i++) 
				arrayProd[i] = array1[i] * array2[i];
		}*/
		return arrayProd;
	}
	
	private static void mostrarValores(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			System.out.println("Indice: "+i+" Numero: "+nums[i]);
		}
	}

}
