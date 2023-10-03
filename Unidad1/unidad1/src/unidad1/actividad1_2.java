package unidad1;

import java.util.Scanner;

public class actividad1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int km,v,tiempo;	
		
		System.out.println("Introduce una distancia");
		Scanner teclado = new Scanner(System.in);
		km = teclado.nextInt();
		
		System.out.println("Introduce la velocidad de desplazamiento");
		v = teclado.nextInt();
		
		tiempo = km/v;
		
		System.out.println("El tiempo que tardas en recorrer esa distancia es " + tiempo + " horas");
		
	}

}
