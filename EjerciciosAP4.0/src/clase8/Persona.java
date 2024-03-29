package clase8;

import java.time.LocalDateTime;

public class Persona {

	
		private String nombre;
		private String apellido;
		private LocalDateTime fechaDeNacimiento;
		private Carrito carrito;
		
		public Persona(String nombre, String apellido, LocalDateTime fechaDeNacimiento, Carrito carrito) {
		
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaDeNacimiento = fechaDeNacimiento;
			this.carrito = carrito;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public LocalDateTime getFechaDeNacimiento() {
			return fechaDeNacimiento;
		}

		public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
			this.fechaDeNacimiento = fechaDeNacimiento;
		}

		public Carrito getCarrito() {
			return carrito;
		}

		public void setCarrito(Carrito carrito) {
			this.carrito = carrito;
		}
		
		
		
	
	

}
