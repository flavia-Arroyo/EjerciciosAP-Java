package clase8;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje{
	
	public float tope;
	

	


	public DescuentoPorcentajeConTope(float tope) {
		super(0);
		this.tope = tope;
		// TODO Auto-generated constructor stub
	}





	public float getTope() {
		return tope;
	}





	public void setTope(float tope) {
		this.tope = tope;
	}
	
	@Override
	public void setValor(float valor) {
		
		if(valor > this.tope) {
			super.setValor(0);
			System.out.println("El descuento supera el tope de descuento");
		}else {
			super.setValor(valor);
			
		}
		
	}
	
	

}
