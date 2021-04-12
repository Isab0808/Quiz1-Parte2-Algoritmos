package controlador;

import modelo.Logica;
import processing.core.PApplet;

public class Control {

	private Logica logica;
	
	public Control() {
		logica = new Logica();
	}

	public void añadirCuadrados(PApplet app) {
		logica.añadirCuadrados(app);
	}

	public void añadirCirculos(PApplet app) {
		logica.añadirCirculos(app);
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

	public void pararMoverCuadrados(PApplet app) {
		logica.pararMoverCuadrados(app);
		
	}

	public void pararMoverCirculos(PApplet app) {
		logica.pararMoverCirculos(app);
		
	}

	public void pararMoverTriangulos(PApplet app) {
		logica.pararMoverTriangulos(app);
		
	}

	public void validarChoque(PApplet app) {
		logica.validarChoque(app);
		
	}

}
