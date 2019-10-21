package interfacesUsuario;

import archivo.*;
import contextoProblema.Boleta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	private GestorCSV gestor;
	public static String ruta = "usuarios.csv";

	public void anadirBoleta(String ruta) {
		Boleta nuevaBoleta = new Boleta();
		String pedido = nuevaBoleta.eleccionPedido() ;

		gestor.agregarTexto(pedido, ruta);
	}


	/**
	 * Metodo que llama a un menu clasico
	 */
	public void verMenu() {
		String formatoCSV = "Id, Fecha, Listado de platos con precio, Total";
		gestor.crearArchivo(formatoCSV, "boletas.csv");

		boolean ejec = true;
		System.out.println("Bienvenido al menu principal, ¿Que desea hacer?");
		do {
			System.out.println("Selecciona la operacion a realizar");
			System.out.println("1 - Leer Json");
			System.out.println("2 - Agregar Libros");
			System.out.println("3 - Vender Libros");
			System.out.println("4 - Eliminar Libreria.json");
			System.out.println("9 - Terminar");
			int opcion = validarNumero();
			if (opcion >= 1 && opcion <= 2 ) {
				seleccion(opcion);
			} else if (opcion == 9) {
				ejec = false;
			} else {
				System.out.println("Opcion no valida");
			}

		} while (ejec);
	}

	/**
	 *
	 * @param opcion
	 */
	private void seleccion(int opcion) {

		switch(opcion){
			case 1:
				anadirBoleta(ruta);
				break;
			case 2:
				verBoletas(ruta);
				break;
			default:
				break;
		}
	}

	private void verBoletas(String ruta) {
		gestor.leerArchivo(ruta);
	}


	/**
	 * Metodo que valida los numeros ingresados de letra y/o caracteres
	 * @return Retorna una Variable de tipo int.
	 */
	private int validarNumero() {
		Scanner teclado = new Scanner(System.in);
		int entrada = 0;
		boolean valido;
		do {
			try {
				entrada = teclado.nextInt();
				if (entrada >= 0){
					valido = false;
				} else {
					System.out.println("Ingreso de negativo, Invalido");
					valido = true;
				}
			} catch (InputMismatchException ime) {
				System.out.println("No ingrese letras u oraciones");
				teclado.next();
				valido = true;
			}
		} while (valido);
		return entrada;
	}


}