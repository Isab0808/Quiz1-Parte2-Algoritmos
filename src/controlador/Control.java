package controlador;

import modelo.Logica;

public class Control {

	private Logica logica;
	
	public Control() {
		logica = new Logica();
	}

	public void añadirFiguras() {
		logica.añadirFiguras();
		
	}

}
