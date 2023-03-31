package clase8;

public abstract class Descuento {
	private float valor;
	
	

	public Descuento(float valor) {
		
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public abstract float valorFinal(float valorInicial) throws ValorCeroException, TotalNegativoException;//este metodo al ser abstracto
	//debe ser implementado por el que herede de esta clase abstracta
	
	
	

}
