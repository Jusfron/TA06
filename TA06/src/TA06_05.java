
import javax.swing.JOptionPane;

public class TA06_05 {

	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
		int digitos;
		digitos = calcularDigitos(num);
		//JOptionPane.showMessageDialog(null, "El numero de digitos binarios es "+digitos);
		JOptionPane.showMessageDialog(null, "El numero en binario es "+conversionBinario(num, digitos));
	}
	
	private static int calcularDigitos(int num) {
		int digitos = 0;
		while(true) {
			if(num / 2 == 0) {
				if(num % 2 == 0) {
					return digitos;
				} else {
					digitos++;
					return digitos;
				}
			} else {
				num /= 2;
				digitos++;
			}
		}
	}

	private static String conversionBinario(int num, int digitos) {
		String binario = "";
		for(int i = digitos-1; i >= 0; i--) {
			if((num & (int)Math.pow(2, i)) == 0) {
				binario = binario + '0';
			} else {
				binario = binario + '1';
			}
		}
		
		return binario;
	}
}
