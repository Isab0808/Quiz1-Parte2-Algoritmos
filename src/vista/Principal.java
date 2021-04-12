package vista;
import controlador.Control;
import processing.core.PApplet;

public class Principal extends PApplet{

	private Control control;
	
	public static void main(String[] args) {
		PApplet.main(Principal.class.getName());
	}

	@Override
	public void settings() {
		size(500, 500);
	}
	
	@Override
	public void setup() {
		control = new Control();
		
	}
	
	@Override
	public void draw() {
		background(255);
		
		control.dibujarCuadrados(this);
		control.dibujarCirculos(this);
		control.dibujarTriangulos(this);
		
		control.validarChoque(this);
	}
	
	@Override
	public void mousePressed() {
		control.añadirCuadrados(this);
		control.añadirCirculos(this);
		
		control.pararMoverCuadrados(this);
		control.pararMoverCirculos(this);
		control.pararMoverTriangulos(this);
	}
	
	

}
