import java.util.Scanner;

public class TA06_09 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		rellenarValores(nums);
		mostrarValores(nums);
	}

	private static void rellenarValores(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*10);
		}
	}
	
	private static void mostrarValores(int[] nums) {
		int suma = 0;
		for(int i = 0; i < nums.length; i++) {
			System.out.println("Indice: "+i+" Numero: "+nums[i]);
			suma += nums[1];
		}
		System.out.println("Suma total: "+suma);
	}
	
}
