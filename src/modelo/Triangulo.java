package modelo;

import processing.core.PApplet;

public class Triangulo {

public final static int SPEED = 3;
	
	private int posicionX,posicionY;
	private int dir;
	private int tama�o;
	public int valor;
	private int r,g,b;
	
	private boolean estadoTriangulo;
	
	public Triangulo(int posicionX, int posicionY, int tama�o, int valor, PApplet app) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.tama�o = tama�o;
		this.dir = dir;
		
		r = (int)(Math.random()*255);
		g = (int)(Math.random()*200);
		b = (int)(Math.random()*200);
		
		estadoTriangulo = true;
		
		this.valor = valor;
	}
	
	public void pintar (PApplet app) {
		app.fill(r,g,b);
		app.triangle(posicionX-tama�o, posicionY+tama�o, posicionX, posicionY-tama�o, posicionX+tama�o, posicionY+tama�o);
		app.textSize(15);
		app.fill(0);
		app.text(valor, posicionX-5, posicionY+5);
		mover();
	}
	
	public void mover() {
		if (estadoTriangulo == true) {
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

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public boolean isEstadoTriangulo() {
		return estadoTriangulo;
	}

	public void setEstadoTriangulo(boolean estadoTriangulo) {
		this.estadoTriangulo = estadoTriangulo;
	}
	
	public void setmover(boolean estadoCuadrado) {
		this.estadoTriangulo = estadoCuadrado;
	}

}
