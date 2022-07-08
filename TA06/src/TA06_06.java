import javax.swing.JOptionPane;

public class TA06_06 {

	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
		int digitos;
		digitos = calcularDigitos(num);
		JOptionPane.showMessageDialog(null, "El numero de digitos decimales es "+digitos);

	}
	
	private static int calcularDigitos(int num) {
		int digitos = 0;
		while(true) {				//Dividir por 10 hasta que no queden mas cifras
			if(num / 10 == 0) {
				digitos++;
				return digitos;
			} else {
				num /= 10;
				digitos++;
			}
		}
	}

}
