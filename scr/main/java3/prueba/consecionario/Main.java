package prueba.consecionario;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector = new Scanner(System.in);
		Scanner LectorN = new Scanner(System.in);
		int opcion = 0;
		String ter = " ";
		String marcaI = "";
		String modeloI = "";
		int a�oI = 0;
		String placaI = "";
		int kilometrajeI = 0;
		int codigoImportacion = 0;
		int valorImportacion = 0;
		String marcaN = "";
		String modeloN = "";
		int a�oN = 0;
		String placaN = "";
		int kilometrajeN = 0;
		int codigoNacionalN = 0;
		AutoNacional DatosN[] = new AutoNacional[5];
		AutoImportado DatosI[] = new AutoImportado[5];

		do {
			System.out.println("#################################");
			System.out.println("CONCESIONARIO AMBACAR, elija una opci�n:");
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
					System.out.println("Ingrese �Marca �Modelo �A�o fabricaci�n �Placa �Kilometraje �C�digo Nacional");
					for (int i = 0; i < 5; i++) {

						AutoNacional autonacional = new AutoNacional();
						System.out.println("Ingrese datos del autonacional" + i);

						marcaN = Lector.nextLine();
						modeloN = Lector.nextLine();
						a�oN = LectorN.nextInt();
						placaN = Lector.nextLine();
						kilometrajeN = LectorN.nextInt();
						codigoNacionalN = LectorN.nextInt();

						autonacional.setMarca(marcaN);
						autonacional.setModelo(modeloN);
						autonacional.setA�oFabricacion(a�oN);
						autonacional.setPlaca(placaN);
						autonacional.setKilometraje(kilometrajeN);
						autonacional.setCodigoNacional(codigoNacionalN);
						DatosN[i] = autonacional;

					}

				} else if (ter.equals("b")) {
					System.out.println(
							"Ingrese �Marca �Modelo �A�o fabricaci�n �Placa �Kilometraje �C�digo importaci�n �Valor de la importaci�n ");
					for (int i = 0; i < 5; i++) {
						AutoImportado autoimportado = new AutoImportado();

						System.out.println("Ingrese datos del autonacional" + i);

						marcaI = Lector.nextLine();
						modeloI = Lector.nextLine();
						a�oI = LectorN.nextInt();
						placaI = Lector.nextLine();
						kilometrajeI = LectorN.nextInt();
						codigoImportacion = LectorN.nextInt();
						valorImportacion = LectorN.nextInt();

						autoimportado.setMarca(marcaI);
						autoimportado.setModelo(modeloI);
						autoimportado.setA�oFabricacion(a�oI);
						autoimportado.setPlaca(placaI);
						autoimportado.setKilometraje(kilometrajeI);
						autoimportado.setC�digoImportaci�n(codigoImportacion);
						autoimportado.setValorDeLaImportacion(valorImportacion);
						DatosI[i] = autoimportado;

					}

				}

				break;

			case 2:
				System.out.println("Ingrese el n�mero de placa del Auto");
				for (int B = 0; B < 5; B++) {
					AutoNacional A [] = DatosN;
					String no1 = placaI;
					String no2 = Lector.nextLine();
					boolean igual = no1.equals(no2);
					System.out.println("yo" + Arrays.toString(DatosN));

					if (igual == true) {
						System.out.println("SI");

					} else {
						System.out.println("NO");
					}
				}

				break;
			case 3:
				System.out.println("Ingrese el n�mero de placa del Auto");

				break;
			case 4:
				System.out.println("");

				break;

			}

		} while (opcion != 5);

	}
}
