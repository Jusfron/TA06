import javax.swing.JOptionPane;

public class TA06_1 {

	public static void main(String[] args) {
		String figura;
		figura = JOptionPane.showInputDialog("Introduce la figura geométrica").toLowerCase();
		switch(figura) {
		case "circulo":
			areaCirculo();
			break;
		case "triangulo":
			areaTriangulo();
			break;
		case "cuadrado":
			areaCuadrado();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Figura geométrica no reconocida");
			break;
		}
	}
	
	private static void areaCirculo() {
		double radio, area;
		radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del circulo"));
		area = Math.pow(radio, 2)*Math.PI;
		JOptionPane.showMessageDialog(null, "Area: "+area);
	}
	
	private static void areaTriangulo() {
		double base, altura, area;
		base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triangulo"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
		area = base * altura / 2;
		JOptionPane.showMessageDialog(null, "Area: "+area);
	}
	
	private static void areaCuadrado() {
		double lado, area;
		lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
		area = lado * lado;
		JOptionPane.showMessageDialog(null, "Area: "+area);
	}

}
