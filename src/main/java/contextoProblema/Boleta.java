package contextoProblema;

import archivo.*;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Boleta {

	private GestorCSV gestor;
	public int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id+1;
	}

	private Pedido pedido;
	public Date fecha;

	public Boleta() {
	}

	public Boleta(GestorCSV gestor, Pedido pedido, Date fecha) {
		this.gestor = gestor;
		this.pedido = pedido;
		this.fecha = fecha;
	}

	public GestorCSV getGestor() {
		return gestor;
	}

	public void setGestor(GestorCSV gestor) {
		this.gestor = gestor;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String eleccionPedido(){

		pedido.mostrarPlatos(pedido.anadirSeleccion());
		System.out.println("Escoja el plato");
		boolean bandera = true;
		do {
			int eleccion= validarNumero();
			if (eleccion<=4 && eleccion >= 0){
				pedido.getPlato(eleccion);
				bandera = false;
			} else {
				bandera = true;
			}

		}while (bandera);

		return id +","+ pedido.toString()+"," + fecha.getDate();

	}

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


	@Override
	public String toString() {
		return "Boleta{" +
				"id=" + id +
				", pedido=" + pedido +
				", fecha=" + fecha +
				'}';
	}
}