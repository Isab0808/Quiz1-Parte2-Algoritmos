package controlador;

import modelo.Logica;
import processing.core.PApplet;

public class Control {

	private Logica logica;
	
	public Control() {
		logica = new Logica();
	}

	public void a�adirCuadrados(PApplet app) {
		logica.a�adirCuadrados(app);
	}

	public void a�adirCirculos(PApplet app) {
		logica.a�adirCirculos(app);
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
