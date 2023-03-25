package clase5;

public class DescuentoFijo extends Descuento{

	public DescuentoFijo(float valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float valorFinal(float valorInicial) {
		// TODO Auto-generated method stub
		float valorFinal = valorInicial - super.getValor();
		if(valorFinal  < 0) {
			return 0;
		}
		return valorFinal;
		
	}

}
