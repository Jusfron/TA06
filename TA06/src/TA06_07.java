import javax.swing.JOptionPane;

public class TA06_07 {
	private static final double LIBRA = 0.86;
	private static final double DOLAR = 1.28611;
	private static final double YEN = 129.852;

	public static void main(String[] args) {
		String divisa;
		double euros;
		euros = Integer.parseInt(JOptionPane.showInputDialog("Introduce los euros"));
		divisa = JOptionPane.showInputDialog("Introduce la divisa a convertir");
		JOptionPane.showMessageDialog(null, euros+"€ a "+divisa+" = "+conversionDivisa(euros, divisa));
	}
	
	private static double conversionDivisa(double euros, String divisa) {
		double result;
		switch (divisa) {
		case "dolares":
			result = euros * DOLAR;
			break;
		case "dolar":
			result = euros * DOLAR;
			break;
		case "libras":
			result = euros * LIBRA;
			break;
		case "libra":
			result = euros * LIBRA;
			break;
		case "yenes":
			result = euros * YEN;
			break;
		case "yen":
			result = euros * YEN;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Divisa no reconocida");
			result = 0;
			break;
		}
		return result;
	}

}
