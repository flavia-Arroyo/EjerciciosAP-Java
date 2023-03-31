package clase8;

public class Producto {
	
		//atributos de la clase
		private String nombre;
		private String codigo;
		private float precio;
		
		//constructor 
		public Producto(String nombre, String codigo, float precio) {
			this.nombre = nombre;
			this.codigo = codigo;
			this.precio = precio;
		}
		//getter and setter

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		

		public void setPrecio(float precio) {
			this.precio = precio;
		}
		
		//otro metodo
		 public float costoFinal() {
			 return this.precio;
		 }
		

	

}
