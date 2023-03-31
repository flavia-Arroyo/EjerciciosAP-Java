package clase8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		//ARCHIVO DONDE TENGO LOS DATOS
		String compra = "comprasextras.txt";
		List<String> lista = new ArrayList<String>();
		Carrito carrito = new Carrito(LocalDateTime.parse("2023-03-18T12:23:00") );
		Persona persona1 = new Persona("flavia", "arroyo", LocalDateTime.parse("1982-03-23T12:23:00"),carrito);
		Carrito miCarrito = persona1.getCarrito();
		
		try {
			
				
			//guardar en una lista 
			lista = Files.readAllLines(Paths.get(compra));
			lista.remove(0); //elimina la primera linea
			//crear los productos acceder a las lineas convierto en un arreglo 
			for(String linea: lista) {
				String[] datosDeProducto = linea.split(" ");
				Producto p = new Producto(datosDeProducto[1], datosDeProducto[2], Float.parseFloat(datosDeProducto[0]));
				miCarrito.agregarProducucto(p);
			}		
			
		} catch (IOException e) {
			System.out.println("HUBO UN ERROR" + e);
		
		}
		
		
		Descuento descFijo = new DescuentoFijo(1000040);
		
		Descuento descPorcentaje = new DescuentoPorcentaje(140f);
		
		Descuento descTope = new DescuentoPorcentajeConTope(0.30f);
		descTope.setValor(0.10f);
		
		float resultado;
		try {
			resultado = miCarrito.costoFinal(descPorcentaje);
			System.out.println("el costo total del carrito es: " + resultado);
		} catch (ValorCeroException | TotalNegativoException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
		
	

	}

}
