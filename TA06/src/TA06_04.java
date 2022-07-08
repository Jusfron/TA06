import javax.swing.JOptionPane;

public class TA06_04 {

	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
		JOptionPane.showMessageDialog(null, "El factorial de "+num+" es "+calcularFactorial(num));
	}
	
	private static int calcularFactorial(int num) {
		int factorial=1;
		for(int i = 1; i < num+1; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
