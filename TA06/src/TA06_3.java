import javax.swing.JOptionPane;

public class TA06_3 {

	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
		if(esPrimo(num)) {
			JOptionPane.showMessageDialog(null, "El numero es primo");
		} else {
			JOptionPane.showMessageDialog(null, "El numero no es primo");
		}
		
	}
	
	private static boolean esPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}

}
