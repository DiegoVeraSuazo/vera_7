package contextoProblema;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Pedido {

	public Plato plato;
	public ArrayList<Plato> platos;
	public float total;
	public Calendar fecha;

	public Pedido() {
	}

	public Pedido(Plato plato, Calendar fecha, float total, ArrayList<Plato> platos) {
		this.plato = plato;
		this.fecha = fecha;
		this.total = total;
		this.platos = platos;
	}

	public Plato getPlato(int eleccion) {

		return platos.get(eleccion);
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(ArrayList<Plato> platos) {
		this.platos = platos;
	}

	public ArrayList<Plato> anadirSeleccion() {
		Plato plato1 = new Plato("empanadas", 5990);
		Plato plato2 = new Plato("pizza", 6990);
		Plato plato3 = new Plato("churros", 3990);
		Plato plato4 = new Plato("papas fritas", 4990);
		Plato plato5 = new Plato("humitas", 11990);

		platos.add(plato1);
		platos.add(plato2);
		platos.add(plato3);
		platos.add(plato4);
		platos.add(plato5);
		return platos;
	}

	public void mostrarPlatos(ArrayList<Plato> platos) {

		for (int i = 0; i < platos.size() ; i++) {
			System.out.println(i +". "+ platos.get(i));
		}

	}

	@Override
	public String toString() {
		return "Pedido{" +
				"plato=" + plato +
				'}';
	}
}