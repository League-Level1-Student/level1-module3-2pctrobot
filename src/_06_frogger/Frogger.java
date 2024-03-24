package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int frogX = 400;
    int frogY = 600;
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
        carSpeed = 100;
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
		car2.rightSpeed();
		car3.leftSpeed();
		car4.rightSpeed();
		car5.leftSpeed();
		car6.rightSpeed();
		car7.leftSpeed();
		car8.rightSpeed();
		car9.leftSpeed();
		car0.rightSpeed();
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
            else if(keyCode == DOWN && frogY<=570)
            {
            	frogY+=10; 
            }
            else if(keyCode == RIGHT && frogX<=770)
            {
            	frogX+=10;
            }
            else if(keyCode == LEFT && frogX>=30)
            {
            	frogX-=10;
            }
            
        }
    }
}
