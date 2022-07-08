import java.util.Scanner;

public class TA06_10 {

	public static void main(String[] args) {
		int tamArr, primBeg, primEnd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array");
		tamArr = sc.nextInt();
		System.out.println("Introduce dos numeros del rango de numeros primos");
		primBeg = sc.nextInt();
		primEnd = sc.nextInt();
		sc.close();
		int[] array = new int[tamArr];
		rellenarValores(array,primBeg,primEnd);
		mostrarValores(array);
		
	}

	private static void rellenarValores(int[] nums,int rangoInicial,int rangoFinal) {
		int num;
		for (int i = 0; i < nums.length; i++) {
			while(true) {
				num = (int)(Math.random()*((double)rangoFinal-(double)rangoInicial)+(double)rangoInicial);	//generar numero aleatorio dentro rango
				if(esPrimo(num) ) {
					nums[i] = num;
					break;
				}
			}
		}
	}
	
	private static void mostrarValores(int[] nums) {
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			System.out.println("Indice: "+i+" Numero: "+nums[i]);
			if(max < nums[i])	//buscar numero maximo
				max = nums[i];
		}
		System.out.println("Numero maximo: "+max);
	}
	
	private static boolean esPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}

}
