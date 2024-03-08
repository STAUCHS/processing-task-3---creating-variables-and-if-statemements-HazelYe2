import processing.core.PApplet;
import java.util.Random;
import java.lang.Math;

public class Sketch extends PApplet {
    //Define variables
    int intRandom;
    int min;
    int max;
    int intHours;
    int intMinutes;

    /**
    * Print out a picture of a flower
    * @author: H. Ye
    */


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
    background(102, 204, 255);
    // Add random
    Random myRand = new
    Random();
    myRand.nextInt(100);
    min = 0;
    max = 101;
    intRandom = (int)Math.floor(Math.random() * (max - min + 1) + min);
    }

    /**
    * Called repeatedly, anything drawn to the screen goes here
    */
    public void draw() {
    /* Flower */
    
    if (intRandom <= 68 && intRandom >= 0) {
    background(247, 16, 0);
    } else 
        
    // Draw four petals for the flower 
    fill (204, 51, 255);
    ellipse ((float)(width/2), 300, 200, 200);
    ellipse ((float)(width/1.33), 300, 200, 200); 
    ellipse ((float)(width/2), 500, 200, 200);
    ellipse ((float)(width/1.33), 500, 200, 200);

    // Draw the middle of the flower
    fill (255, 255, 0);
    ellipse ((float)(width/1.6), 400, 200, 200);

    // Draw the stem of the flower
    line ((float)(width/1.6), 500, (float)(width/1.6), 800);
    stroke (0, 153, 0);
    strokeWeight (10); 

    // Draw the leaves on the stem of the flower
    fill (0, 204, 0);
    triangle ((float)(width/1.61), 650, (float)(width/2.1), 670, (float)(width/1.61), 700);
    triangle ((float)(width/1.6), 700, (float)(width/1.35), 735, (float)(width/1.6), 730);

    // Draw the sun on the top left-hand corner
    fill (255, 255, 0);
    ellipse (0, 0, 500, 500);

    // Draw the dirt/grass 
    fill (81, 21, 21);
    rect (0, 770, 800, 800);

    // Add the current time

    textSize(30);
    fill(0, 0, 0);

    intHours = hour();
    intMinutes = minute();

    text(intHours, 10, 30);
    text(intMinutes, 50, 30);

    }
  }