package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int frogX = 400;
    int frogY = 600;
    int points = 0;
    int carSize;
    int carSpeed;
    Car car1;
    Car car2;
    Car car3;
    Car car4;
    Car car5;
    Car car6;
    Car car7;
    Car car8;
    Car car9;
    Car car0;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        carSize = 60;
        carSpeed = 1;
        car1 = new Car(800, 0, carSize, carSpeed);
        car2 = new Car(700, 60, carSize, carSpeed);
        car3 = new Car(600, 120, carSize, carSpeed);
        car4 = new Car(500, 180, carSize, carSpeed);
        car5 = new Car(400, 240, carSize, carSpeed);
        car6 = new Car(300, 300, carSize, carSpeed);
        car7 = new Car(200, 360, carSize, carSpeed);
        car8 = new Car(100, 420, carSize, carSpeed);
        car9 = new Car(0, 480, carSize, carSpeed);
        car0 = new Car(300, 540, carSize, carSpeed);
    	
    }

    @Override
    public void draw() {
    	background(143, 127, 124);
    	fill(0, 200, 13);
    	ellipse(frogX,frogY,30,30);
    	fill(15, 0, 148);
		rect(car1.x , car1.y,  car1.size, 50);
		rect(car2.x , car2.y,  car2.size, 50);
		rect(car3.x , car3.y,  car3.size, 50);
		rect(car4.x , car4.y,  car4.size, 50);
		rect(car5.x , car5.y,  car5.size, 50);
		rect(car6.x , car6.y,  car6.size, 50);
		rect(car7.x , car7.y,  car7.size, 50);
		rect(car8.x , car8.y,  car8.size, 50);
		rect(car9.x , car9.y,  car9.size, 50);
		rect(car0.x , car0.y,  car0.size, 50);
		car1.leftSpeed();
		if(intersects(car1)) {
			frogY=600;
		}
		car2.rightSpeed();
		if(intersects(car2)) {
			frogY=600;
		}
		car3.leftSpeed();
		if(intersects(car3)) {
			frogY=600;
		}
		car4.rightSpeed();
		if(intersects(car4)) {
			frogY=600;
		}
		car5.leftSpeed();
		if(intersects(car5)) {
			frogY=600;
		}
		car6.rightSpeed();
		if(intersects(car6)) {
			frogY=600;
		}
		car7.leftSpeed();
		if(intersects(car7)) {
			frogY=600;
		}
		car8.rightSpeed();
		if(intersects(car8)) {
			frogY=600;
		}
		car9.leftSpeed();
		if(intersects(car9)) {
			frogY=600;
		}
		car0.rightSpeed();
		if(intersects(car0)) {
			frogY=600;
		}
		if(points>=1) {
			carSpeed+=1;
			points=0;
			car1.speed = carSpeed;
			car2.speed = carSpeed;
			car3.speed = carSpeed;
			car4.speed = carSpeed;
			car5.speed = carSpeed;
			car6.speed = carSpeed;
			car7.speed = carSpeed;
			car8.speed = carSpeed;
			car9.speed = carSpeed;
			car0.speed = carSpeed;
		}
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP && frogY>=30)
            {
                frogY-=10;
            }
            else if(keyCode == UP && frogY<=30)
            {
                frogY=570;
                points+=1;
            }
            else if(keyCode == DOWN && frogY<=570)
            {
            	frogY+=10; 
            }
            else if(keyCode == RIGHT && frogX<=770)
            {
            	frogX+=10;
            }
            else if(keyCode == RIGHT && frogX>=770)
            {
            	frogX=30;
            }
            else if(keyCode == LEFT && frogX>=30)
            {
            	frogX-=10;
            }
            else if(keyCode == LEFT && frogX<=30)
            {
            	frogX=770;
            }
        }
    }
    boolean intersects(Car car) {
    	 if ((frogY > car.getY() && frogY < car.getY()+50) &&
    	                (frogX > car.getX() && frogX < car.getX()+car.getSize())) {
    	   return true;
    	  }
    	 else  {
    	  return false;
    	 }
}}
