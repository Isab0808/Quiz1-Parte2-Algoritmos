package vista;
import controlador.Control;
import processing.core.PApplet;

public class Principal extends PApplet{

	private Control control;
	
	public static void main(String[] args) {
		PApplet.main("Principal");
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
		
	}
	
	@Override
	public void mousePressed() {
		control.añadirFiguras();
	}
	
	

}
