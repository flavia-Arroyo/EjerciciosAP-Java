package clase8;

public class DescuentoPorcentaje extends Descuento {

	public DescuentoPorcentaje(float valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float valorFinal(float valorInicial) throws ValorCeroException, TotalNegativoException{
		// TODO Auto-generated method stub
		
		float valorFinal = valorInicial - (valorInicial * super.getValor());
		 
		return valorFinal;
				
	}

}
