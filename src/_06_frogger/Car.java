package _06_frogger;

import processing.core.PApplet;

public class Car extends PApplet {
	int x;
	int y;
	int size;
	int speed;
	
	Car(int x, int y, int size, int speed) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.speed = speed;
	}
	
	void leftSpeed(){
		x -= speed;
		if(x<=0) {
			x = 800;
		}
	}
	void rightSpeed(){
		x += speed;
		if(x>=800) {
			x = 0;
		}
	}

	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
	
}
