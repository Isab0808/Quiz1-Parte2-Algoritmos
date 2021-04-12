package controlador;

import modelo.Logica;

public class Control {

	private Logica logica;
	
	public Control() {
		logica = new Logica();
	}

	public void aņadirCuadrados() {
		logica.aņadirCuadrados();
	}

	public void aņadirCirculos() {
		logica.aņadirCirculos();
	}

	public void dibujarCuadrados() {
		logica.dibujarCuadrados();
		
	}

	public void dibujarCirculos() {
		logica.dibujarCirculos();
	}

	public void dibujarTriangulos() {
		logica.dibujarTriangulos();
		
	}

	public void pararMoverCuadrados() {
		logica.pararMoverCuadrados();
		
	}

	public void pararMoverCirculos() {
		logica.pararMoverCirculos();
		
	}

	public void pararMoverTriangulos() {
		logica.pararMoverTriangulos();
		
	}

	public void validarChoque() {
		logica.validarChoque();
		
	}

}
