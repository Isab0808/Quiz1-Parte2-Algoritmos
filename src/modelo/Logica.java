package modelo;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {
	
	private Cuadrado cuadrado;
	private Circulo circulo;
	private Triangulo triangulo;
	
	public ArrayList<Cuadrado>listaCuadrados;
	public ArrayList<Circulo>listaCirculos;
	public ArrayList<Triangulo>listaTriangulos;

	public Logica() {
		listaCuadrados = new ArrayList<>();
		listaCirculos = new ArrayList<>();
		listaTriangulos = new ArrayList<>();
	}

	public void añadirCuadrados(PApplet app) {
		int tamaño = (int)(Math.random()*30*40);
		int posicionY = (int)(Math.random()*50*450);
		listaCuadrados.add(new Cuadrado(-50, posicionY, tamaño, app));
	}

	public void añadirCirculos(PApplet app) {
		int tamaño = (int)(Math.random()*20*40);
		int posicionX = (int)(Math.random()*0*450);
		listaCirculos.add(new Circulo(posicionX, -50, tamaño, app));
	}

	public void dibujarCuadrados(PApplet app) {
		for (int i = 0; i < listaCuadrados.size(); i++) {
			listaCuadrados.get(i).pintar(app);
		}
	}

	public void dibujarCirculos(PApplet app) {
		for (int i = 0; i < listaCirculos.size(); i++) {
			listaCirculos.get(i).pintar(app);
		}
	}

	public void dibujarTriangulos(PApplet app) {
		for (int i = 0; i < listaTriangulos.size(); i++) {
			listaTriangulos.get(i).pintar(app);
		}
	}

	public void pararMoverCuadrados() {
		// TODO Auto-generated method stub
		
	}

	public void pararMoverCirculos() {
		// TODO Auto-generated method stub
		
	}

	public void pararMoverTriangulos() {
		// TODO Auto-generated method stub
		
	}

	public void validarChoque() {
		// TODO Auto-generated method stub
		
	}

}
