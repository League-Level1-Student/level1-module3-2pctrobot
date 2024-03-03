package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int frogX = 370;
    int frogY = 570;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

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
            if(keyCode == UP && frogY>=0)
            {
                frogY-=10;
            }
            else if(keyCode == DOWN && frogY<=600)
            {
            	frogY+=10; 
            }
            else if(keyCode == RIGHT && frogX<=800)
            {
            	frogX+=10;
            }
            else if(keyCode == LEFT && frogX>=0)
            {
            	frogX-=10;
            }
        }
    }
}
