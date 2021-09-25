package prueba.consecionario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector = new Scanner(System.in);
		Scanner LectorN = new Scanner(System.in);
		int opcion = 0;
		String ter = " ";

		do {
			System.out.println("#################################");
			System.out.println("CONCESIONARIO AMBACAR, elija una opción:");
			System.out.println("1.Ingresar Auto:");
			System.out.println("2.Consultar Auto");
			System.out.println("3.Actualizar Kilometraje");
			System.out.println("4.Imprimir Reporte");
			System.out.println("5.SALIR");
			System.out.println("#################################");
			opcion = LectorN.nextInt();
			switch (opcion) {
			case 1:

				System.out.println("a) Auto Nacional");
				System.out.println("b) Auto Importado");
				ter = Lector.nextLine();

				if (ter.equals("a")) {
					System.out.println("Ingrese •Marca •Modelo •Año fabricación •Placa •Kilometraje •Código Nacional");

				} else if (ter.equals("b")) {
					System.out.println(
							"Ingrese •Marca •Modelo •Año fabricación •Placa •Kilometraje •Código importación •Valor de la importación ");

				}

				break;

			case 2:
				System.out.println("Ingrese el número de placa del Auto");

				break;
			case 3:
				System.out.println("Ingrese el número de placa del Auto");

				break;
			case 4:
				System.out.println("Ingrese el número de placa del Auto");

				break;

			}

		} while (opcion != 5);

	}

}
