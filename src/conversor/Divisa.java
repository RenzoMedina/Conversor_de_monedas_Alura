package conversor;

public  class Divisa implements Cambio  {
	
	public String tipo;
	public String local = "Pesos Chilenos";
	public double valor;
	
	private static double numeroConvertido;
	
	public Divisa(String tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	@Override
	public double venta(double cantidad) {
		try {			
			double resultado = cantidad / this.valor;
			numeroConvertido = Math.round(resultado*100.0)/100.0;
			return numeroConvertido;
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		return 0;
			
	}

	@Override
	public double cambio(double cantidad) {
		double resultado = cantidad * this.valor;
		numeroConvertido = Math.round(resultado*100.0)/100.0;
		return numeroConvertido;
	}
	
	
}
