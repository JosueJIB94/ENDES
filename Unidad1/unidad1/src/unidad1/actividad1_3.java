package unidad1;

import java.util.Scanner;

public class actividad1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, n3;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce primer numero");
		n1 = teclado.nextInt();
		System.out.println("Introduce segundo numero");
		n2 = teclado.nextInt();
		System.out.println("Introduce tercer numero");

		n3 = teclado.nextInt();

		if ((n1 > n2) && (n1 > n3)) {

			System.out.println("El numero mayor es " + n1);

		} else if (n2 > n3) {

			System.out.println("El numero mayor es " + n2);
		}

		else {

			System.out.println("El numero mayor es " + n3);
		}
	}
}
