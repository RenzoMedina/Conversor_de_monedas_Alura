package conversor;

import javax.swing.JOptionPane;

public class Convertidor {

	public static void cambioMonedasExtranjera(Divisa monedas, double valor) {
		JOptionPane.showMessageDialog(null,"Total "+ monedas.venta(valor)+ " "+ monedas.tipo);
		int confirmar = JOptionPane.showConfirmDialog(null, "¿Deseas seguir aquí?");
		
		if (JOptionPane.YES_OPTION == confirmar) {
			JOptionPane.showMessageDialog(null, "Super!!!");
		}
		if(JOptionPane.NO_OPTION == confirmar) {
			JOptionPane.showMessageDialog(null, "Programa terminado!");
		}
	}	
	
	public static void cambioMonedaLocal(Divisa monedas, double valor) {
		JOptionPane.showMessageDialog(null,"Total "+ monedas.cambio(valor)+ " "+ monedas.local);
		int confirmar = JOptionPane.showConfirmDialog(null, "¿Deseas seguir aquí?");
		
		if (JOptionPane.YES_OPTION == confirmar) {
			JOptionPane.showMessageDialog(null, "Super!!!");
		}
	}
}
