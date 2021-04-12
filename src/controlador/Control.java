package controlador;

import modelo.Logica;
import processing.core.PApplet;

public class Control {

	private Logica logica;
	
	public Control() {
		logica = new Logica();
	}

	public void añadirCuadrados() {
		logica.añadirCuadrados();
	}

	public void añadirCirculos() {
		logica.añadirCirculos();
	}

	public void dibujarCuadrados(PApplet app) {
		logica.dibujarCuadrados(app);
		
	}

	public void dibujarCirculos(PApplet app) {
		logica.dibujarCirculos(app);
	}

	public void dibujarTriangulos(PApplet app) {
		logica.dibujarTriangulos(app);
		
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
