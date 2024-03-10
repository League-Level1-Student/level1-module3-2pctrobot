package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int frogX = 400;
    int frogY = 600;

    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	Car car1 = new Car(300, 0, 60, 500);
    	
    }

    @Override
    public void draw() {
    	background(143, 127, 124);
    	fill(0, 200, 13);
    	ellipse(frogX,frogY,30,30);
    	
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
