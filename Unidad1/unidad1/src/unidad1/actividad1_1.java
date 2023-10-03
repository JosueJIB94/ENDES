package unidad1;

import java.util.Scanner;

public class actividad1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre,apellido,completo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		nombre = teclado.next();
		
		System.out.println("Introduce tu apellido");
		apellido = teclado.next();
		
		completo = "Hola " + " " + nombre + " " + apellido;
		
		System.out.println(completo);
		
		
		
	}

}
