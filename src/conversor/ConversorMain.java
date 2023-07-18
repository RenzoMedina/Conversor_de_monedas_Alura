package conversor;

import javax.swing.JOptionPane;

public class ConversorMain {

			
	public static void main(String[] args) {
		
	
		Divisa[] monedas = new Divisa[5];
		
		monedas[0]= new Divisa("Dolares",818.03);
		monedas[1]= new Divisa("Euros", 919.38);
		monedas[2]= new Divisa("Yen Japonés", 5.89);
		monedas[3]= new Divisa("Libras esterlinas", 1069.9);
		monedas[4]= new Divisa("Won Coreano", 0.6470); 

		
		String[] lista = {"Conversor de Moneda","Conversor de Temperatura"};
		String[] money = {"Pesos a Dolar","Pesos a Euro","Pesos a Yen Japonés","Pesos a Libras Esterlinas",
							"Pesos a Won sull-coreano","Dolar a Pesos","Euro a Pesos", 
							"Yen Japonés a Pesos", "Libra Esterlina a Pesos", "Won sul-coreano a Pesos"};

		Object nuevo =	JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú",
				3, null, lista,"" );
		
		if (nuevo == lista[0]) {
			
			try {
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:"));
			Object listaMonedas = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú",
						3, null, money,"" );
			
			if(listaMonedas == money[0]) {
				Convertidor.cambioMonedasExtranjera(monedas[0], valor);				
			}
			if(listaMonedas == money[1]) {
				Convertidor.cambioMonedasExtranjera(monedas[1], valor);
			}
			if(listaMonedas == money[2]) {
				Convertidor.cambioMonedasExtranjera(monedas[2], valor);
			}
			if(listaMonedas == money[3]) {
				Convertidor.cambioMonedasExtranjera(monedas[3], valor);
			}
			if(listaMonedas == money[4]) {
				Convertidor.cambioMonedasExtranjera(monedas[4], valor);
			}
			
			//cambio de moneda local
			if(listaMonedas == money[5]) {
				Convertidor.cambioMonedaLocal(monedas[0], valor);				
			}
			if(listaMonedas == money[6]) {
				Convertidor.cambioMonedaLocal(monedas[1], valor);
			}
			if(listaMonedas == money[7]) {
				Convertidor.cambioMonedaLocal(monedas[2], valor);
			}
			if(listaMonedas == money[8]) {
				Convertidor.cambioMonedaLocal(monedas[3], valor);
			}
			if(listaMonedas == money[9]) {
				Convertidor.cambioMonedaLocal(monedas[4], valor);
			}
			
			} catch (NullPointerException ne) {
				ne.printStackTrace();
				JOptionPane.showMessageDialog(null, "Uppss... no se puede dejar el campo vacio");
			}
			

		}
		
		
		if (nuevo == lista[1]) {
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero que deseas convertir:"));
			System.out.println(valor);
		}
	
	}
	
}
