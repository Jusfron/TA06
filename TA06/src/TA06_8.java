import java.util.Scanner;

public class TA06_8 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		rellenarValores(nums);
		mostrarValores(nums);
	}
	
	private static void rellenarValores(int[] nums) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduce el numero "+i);
			nums[i] = sc.nextInt();
		}
		sc.close();
	}
	
	private static void mostrarValores(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			System.out.println("Indice: "+i+" Numero: "+nums[i]);
		}
	}

}
