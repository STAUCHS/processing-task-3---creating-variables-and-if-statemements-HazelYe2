import processing.core.PApplet;

public class Sketch extends PApplet {
  
    /**
    * Called once at the beginning of execution, put your size all in this method
    */
    public void settings() {
    // put your size call here
    size(800, 800);
    }
  
    /** 
    * Called once at the beginning of execution.  Add initial set up
    * values here i.e background, stroke, fill etc.
    */
    public void setup() {
    random (255);
    background (102, 204, 255);
    }
  
    /**
    * Called repeatedly, anything drawn to the screen goes here
    */
    public void draw() {
  
    // Draw four petals for the flower
    fill (204, 51, 255);
    ellipse (300, 300, 200, 200);
    ellipse (500, 300, 200, 200); 
    ellipse (300, 500, 200, 200);
    ellipse (500, 500, 200, 200);
  
    // Draw the middle of the flower
    fill (255, 255, 0);
    ellipse (400, 400, 200, 200);
  
    // Draw the stem of the flower
    line (400, 500, 400, 800);
    stroke (0, 153, 0);
    strokeWeight (10);
  
    // Draw the leaves on the stem of the flower
    fill (0, 204, 0);
    triangle (400, 650, 300, 670, 400, 700);
    triangle (400, 700, 400, 750, 500, 730);
  
    // Draw the sun on the top left-hand corner
    fill (255, 255, 0);
    ellipse (0, 0, 500, 500);
  
    // Draw the dirt/grass 
    fill (81, 21, 21);
    rect (0, 770, 800, 800);

    }
    
    // define other methods down here.
}