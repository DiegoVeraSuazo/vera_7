package contextoProblema;

public class Plato {

	public String nombrePlato;
	public float precioPlato;

	public Plato() {
	}

	/**
	 * 
	 * @param nombrePlato
	 * @param precioPlato
	 */
	public Plato(String nombrePlato, float precioPlato) {
		this.nombrePlato = nombrePlato;
		this.precioPlato = precioPlato;

	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public float getPrecioPlato() {
		return precioPlato;
	}

	public void setPrecioPlato(float precioPlato) {
		this.precioPlato = precioPlato;
	}


	@Override
	public String toString() {
		return "Plato{" + "nombrePlato='" + nombrePlato + '\'' + ", precioPlato=" + precioPlato +'}';
	}
}