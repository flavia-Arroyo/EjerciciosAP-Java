package clase5;

import java.time.LocalDateTime;

public class Carrito {
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private LocalDateTime fechaCompra;
	
	// CONSTRUCTOR
	public Carrito(Producto producto1, Producto producto2, Producto producto3, LocalDateTime fechaCompra) {
		
		this.producto1 = producto1;
		this.producto2 = producto2;
		this.producto3 = producto3;
		this.fechaCompra = fechaCompra;
	}

	public Producto getProducto1() {
		return producto1;
	}

	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}

	public Producto getProducto2() {
		return producto2;
	}

	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}

	public Producto getProducto3() {
		return producto3;
	}

	public void setProducto3(Producto producto3) {
		this.producto3 = producto3;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	// otro 
	
	public float costoFinal(Descuento descuento) {
		float total = descuento.valorFinal(this.producto1.costoFinal() + this.producto2.costoFinal() + this.producto3.costoFinal());
		
		return total;
	}

	
	

}
