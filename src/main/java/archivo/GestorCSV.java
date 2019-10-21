package archivo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GestorCSV {

	/**
	 * Metodo que agrega texto al .csv
	 * @param texto
	 * @param ruta es el nombre del archivo donde se agregar el texto
	 */
	public void agregarTexto(String texto, String ruta){
		Path archivo = Paths.get(ruta);
		System.out.println("Ingrese un nuevo usuario");
		String textoAgregado = texto;
		try {
			String textoAnterior = new String(Files.readAllBytes(archivo));
			texto = textoAnterior+"\n"+textoAgregado;
			Files.write(archivo, texto.getBytes());
			System.out.println("Se ha guardado el archivo");
		} catch (IOException e) {
			System.out.println("El archivo no pudo ser guardado");
		}
	}

	/**
	 * Metodo que crea o reinicia el archivo "usuarios.csv"
	 * @param texto es el texto con el que inicia el archivo
	 * @param ruta  es el nombre del archivo que se va a crear
	 */
	public void crearArchivo(String texto, String ruta){

		if(new File(ruta).exists()){}
		else{
			Path archivo = Paths.get(ruta);
			try{

				Files.write(archivo, texto.getBytes());
				System.out.println("Se ha Creado el archivo "+ ruta);
			}
			catch(IOException e) {
				System.out.println("El archivo no pudo ser guardado");
			}

		}
	}

	/**
	 * Metodo que permite ver lo escrito en el archivo
	 * @param ruta es el nombre del archivo donde se encuentra lo escrito
	 */
	public void leerArchivo(String ruta){
		Path archivo = Paths.get(ruta);
		String texto = "";
		try {
			texto = new String(Files.readAllBytes(archivo));
			System.out.println("El contenido del archivo es: \n"+texto);
		} catch (IOException e) {
			System.out.println("El archivo no pudo ser leido");
		}
	}

}