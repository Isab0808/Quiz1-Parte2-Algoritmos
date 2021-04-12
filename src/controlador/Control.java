package controlador;

import modelo.Logica;

public class Control {

	private Logica logica;
	
	public Control() {
		logica = new Logica();
	}

	public void a�adirCuadrados() {
		logica.a�adirCuadrados();
	}

	public void a�adirCirculos() {
		logica.a�adirCirculos();
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
