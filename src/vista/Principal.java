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
		
	}
	
	@Override
	public void setup() {
		control = new Control();
		
	}
	
	@Override
	public void draw() {
		control.dibujarCuadrados();
		control.dibujarCirculos();
		control.dibujarTriangulos();
		
		control.validarChoque();
	}
	
	@Override
	public void mousePressed() {
		control.añadirCuadrados();
		control.añadirCirculos();
		
		control.pararMoverCuadrados();
		control.pararMoverCirculos();
		control.pararMoverTriangulos();
	}
	
	

}
