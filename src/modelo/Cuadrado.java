package modelo;

import processing.core.PApplet;

public class Cuadrado {

	private Logica miLogica;
public final static int SPEED = 3;
	private int posicionX;
	private int posicionY;
	private int dir;
	private int tamaño;
	public int valor;
	
	private int r,g,b;
	
	private boolean estadoCuadrado;
	
	public Cuadrado(int posicionX, int posicionY, int tamaño, PApplet app) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.tamaño = tamaño;
		this.dir = dir;
		
		r = (int)(Math.random()*255);
		g = (int)(Math.random()*200);
		b = (int)(Math.random()*200);
		
		estadoCuadrado = true;
		
		valor =  (int) (Math.random()*10);
	}
	
	public void pintar (PApplet app) {
		app.fill(r,g,b);
		app.rect(posicionX, posicionY, tamaño, tamaño);
		app.textSize(15);
		app.fill(0);
		app.text(valor, posicionX+10, posicionY+10);
		mover();
	}
	
	public void mover () {
		if (estadoCuadrado == true) {
			if(dir=='U') {
				posicionY-=SPEED;
			}
			else if(dir=='D') {
				posicionY+=SPEED;
			}
			else if(dir=='R') {
				posicionX+=SPEED;
			}
			else if(dir=='L') {
				posicionX-=SPEED;
			}
			
			rebota();
		}
		}
	
	public void rebota() {
		if(posicionX>490) {
			dir='L';
		}
		else if(posicionX<0) {
			dir='R';
		}
		else if(posicionY>490) {
			dir='U';
		}
		else if(posicionY<0) {
			dir='D';
		}
	}

	public int getPosicionX() {
		return posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public int getTamaño() {
		return tamaño;
	}
	
	public void setmover(boolean estadoCuadrado) {
		this.estadoCuadrado = estadoCuadrado;
		
	}
	public boolean estadoCuadrado() {
		return estadoCuadrado;
	}
	
	public int getValor() {
		return valor;
	}

}
