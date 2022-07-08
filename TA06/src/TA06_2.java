import javax.swing.JOptionPane;

public class TA06_2 {

	public static void main(String[] args) {
		int numAleatorios, rangoInicial, rangoFinal;
		numAleatorios = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de numeros aleatorios"));
		rangoInicial = Integer.parseInt(JOptionPane.showInputDialog("Introduce el inicio del rango de numeros"));
		rangoFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduce el final del rango de numeros"));
		for (int i = 0; i < numAleatorios; i++) {
			System.out.println("Numero "+(i+1)+": "+generarAleatorio(rangoInicial, rangoFinal));
		}
	}
	
	private static int generarAleatorio (int rangoInicial, int rangoFinal) {
		double random = Math.random();
		int numFinal;
		numFinal = (int)(random*((double)rangoFinal-(double)rangoInicial)+(double)rangoInicial);
		return numFinal;
	}

}
