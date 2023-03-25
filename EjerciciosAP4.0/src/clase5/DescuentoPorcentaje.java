package clase5;

public class DescuentoPorcentaje extends Descuento {

	public DescuentoPorcentaje(float valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float valorFinal(float valorInicial) {
		// TODO Auto-generated method stub
		
		float valorFinal = valorInicial - (valorInicial * super.getValor());
		 if(valorFinal < 0) {
			 return 0;
		 }
		return valorFinal;
				
	}

}
