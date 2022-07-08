import java.util.Scanner;

public class TA06_12 {

	public static void main(String[] args) {
		int tamArr1, num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño del array");	//definir array
		tamArr1 = sc.nextInt();
		int[] array1 = new int[tamArr1];

		System.out.println("Introduce un numero de 0 a 9");
		num = sc.nextInt();
		while(true) {	//Repetir hasta sacar un numero correcto
			if((num>-1) && (num<10)) {
				break;
			}
			System.out.println("Introduce un numero de 0 a 9");
			num = sc.nextInt();
		}
		sc.close();
		
		rellenarValores(array1);
		mostrarValores(array1, num);
	}
	
	private static void rellenarValores(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*300+1);	//generar numero aleatorio de 1 a 300
		}
	}
	
	private static int sacarUltDigito (int num) {
		return num%10;
	}
	
	private static void mostrarValores(int[] nums, int digito) {
		System.out.println("Mostrando todos los numeros del array que acaben en "+digito+" :");
		for(int i = 0; i < nums.length; i++) {
			if(sacarUltDigito(nums[i]) == digito) {
				System.out.println("Indice: "+i+" Numero: "+nums[i]);
			}
		}
		System.out.println("Final del programa.");
	}

}
