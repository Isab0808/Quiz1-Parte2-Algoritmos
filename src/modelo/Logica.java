package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {
	
	private Cuadrado cuadrado;
	private Circulo circulo;
	private Triangulo triangulo;
	
	public ArrayList<Cuadrado>listaCuadrados;
	public ArrayList<Circulo>listaCirculos;
	public ArrayList<Triangulo>listaTriangulos;
	private ArrayList <String> texto;

	public Logica() {
		listaCuadrados = new ArrayList<>();
		listaCirculos = new ArrayList<>();
		listaTriangulos = new ArrayList<>();
	}

	public void añadirCuadrados(PApplet app) {
		int tamaño = (int)(Math.random()*40+20);
		int posicionY = (int)(Math.random()*420+50);
		listaCuadrados.add(new Cuadrado(-50, posicionY, tamaño, app));
	}

	public void añadirCirculos(PApplet app) {
		int tamaño = (int)(Math.random()*60+20);
		int posicionX = (int)(Math.random()*450+50);
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

	public void validarChoque(PApplet app) {
		for (int i = 0; i < listaCirculos.size(); i++) {
			for (int j = 0; j < listaCuadrados.size(); j++) {
				
				int tamaño = (int)(Math.random()*40+20);
				int posicionX = (int)(Math.random()*450+50);
				
				if(app.dist(listaCuadrados.get(j).getPosicionX(), listaCuadrados.get(j).getPosicionY(),
				listaCirculos.get(i).getPosicionX(), listaCirculos.get(i).getPosicionY())<= listaCirculos.get(i).getTamaño()) {
					int valor = listaCirculos.get(i).getValor() + listaCuadrados.get(j).getValor();
				listaCirculos.remove(i);
				listaCuadrados.remove(j);
				listaTriangulos.add(new Triangulo(posicionX, -50, tamaño, valor, app));
				System.out.println("CHOCO");}}
	}
	}
	
	public void texto() {
		texto = new ArrayList<String>();
		try {
			cargarArchivo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void cargarArchivo() throws Exception {
		FileReader fr = null;
		File prueba = new File("data/texto.txt");
		try {
			fr = new FileReader(prueba);
			BufferedReader br = new BufferedReader(fr);
			String linea;
	        while((linea=br.readLine())!=null)
	          texto.add(linea);
		} catch (Exception e) {
			 e.printStackTrace();
		}
		finally{
			         try{                    
			            if( null != fr ){   
			               fr.close();     
			            }                  
			         }catch (Exception e2){ 
			            e2.printStackTrace();
			         }
			      }
	}

}
