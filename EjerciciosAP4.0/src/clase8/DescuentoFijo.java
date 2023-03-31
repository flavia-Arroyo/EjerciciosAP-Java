package clase8;

public class DescuentoFijo extends Descuento{

	public DescuentoFijo(float valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float valorFinal(float valorInicial) throws ValorCeroException, TotalNegativoException {
		// TODO Auto-generated method stub
		float valorFinal = valorInicial - super.getValor();
		
		return valorFinal;
		
	}

}
