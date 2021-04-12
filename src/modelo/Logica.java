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
		int tamaño = (int)(Math.random()*40);
		int posicionY = (int)(Math.random()*450);
		listaCuadrados.add(new Cuadrado(-50, posicionY, tamaño, app));
	}

	public void añadirCirculos(PApplet app) {
		int tamaño = (int)(Math.random()*40);
		int posicionX = (int)(Math.random()*450);
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

	public void pararMoverCuadrados(PApplet app) {
		for (int i = 0; i < listaCuadrados.size(); i++) {
			if (app.mouseX > (listaCuadrados.get(i).getPosicionX() - (listaCuadrados.get(i).getTamaño() / 2)) && 
				app.mouseX < (listaCuadrados.get(i).getPosicionX() + (listaCuadrados.get(i).getTamaño() / 2)) && 
				app.mouseY > (listaCuadrados.get(i).getPosicionY() - (listaCuadrados.get(i).getTamaño() / 2)) && 
				app.mouseY < (listaCuadrados.get(i).getPosicionY() + (listaCuadrados.get(i).getTamaño() / 2))) {
				listaCuadrados.get(i).setmover(!listaCuadrados.get(i).estadoCuadrado());
				}
			}
	}

	public void pararMoverCirculos(PApplet app) {
		for (int i = 0; i < listaCirculos.size(); i++) {
			if (app.mouseX > (listaCirculos.get(i).getPosicionX() - (listaCirculos.get(i).getTamaño() / 2)) && 
				app.mouseX < (listaCirculos.get(i).getPosicionX() + (listaCirculos.get(i).getTamaño() / 2)) && 
				app.mouseY > (listaCirculos.get(i).getPosicionY() - (listaCirculos.get(i).getTamaño() / 2)) && 
				app.mouseY < (listaCirculos.get(i).getPosicionY() + (listaCirculos.get(i).getTamaño() / 2))) {
				listaCirculos.get(i).setmover(!listaCirculos.get(i).estadoCuadrado());
				}
			}
	}

	public void pararMoverTriangulos(PApplet app) {
		for (int i = 0; i < listaTriangulos.size(); i++) {
			if (app.mouseX > (listaTriangulos.get(i).getPosicionX() - (listaTriangulos.get(i).getTamaño() / 2)) && 
				app.mouseX < (listaTriangulos.get(i).getPosicionX() + (listaTriangulos.get(i).getTamaño() / 2)) && 
				app.mouseY > (listaTriangulos.get(i).getPosicionY() - (listaTriangulos.get(i).getTamaño() / 2)) && 
				app.mouseY < (listaTriangulos.get(i).getPosicionY() + (listaTriangulos.get(i).getTamaño() / 2))) {
				listaTriangulos.get(i).setmover(!listaTriangulos.get(i).isEstadoTriangulo());
				}
			}
	}

	public void validarChoque() {
		// TODO Auto-generated method stub
		
	}

}
