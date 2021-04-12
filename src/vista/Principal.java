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
		control.dibujarCuadrados(this);
		control.dibujarCirculos(this);
		control.dibujarTriangulos(this);
		
		control.validarChoque();
	}
	
	@Override
	public void mousePressed() {
		control.aņadirCuadrados(this);
		control.aņadirCirculos(this);
		
		control.pararMoverCuadrados();
		control.pararMoverCirculos();
		control.pararMoverTriangulos();
	}
	
	

}
