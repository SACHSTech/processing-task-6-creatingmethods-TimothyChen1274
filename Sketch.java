import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * A program that uses methods and return values to produce a repeated drawing with different values through the method and a backgroun colour based on mouse position.
   * @author: T. Chen
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200,1000);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Uses mouse position to determine background colour
    int backgroundColour = MouseColour();
    noStroke();
    fill(backgroundColour);
    rect(0, 0, 1200, 1000);

    // Draws the houses
    drawHouse(35, 100, 154, 51, 213);
    drawHouse(265, 100, 135, 77, 192);
    drawHouse(495, 100, 116, 102, 171);
    drawHouse(725, 100, 97, 128, 150);
    drawHouse(955, 100, 78, 153, 128);
    drawHouse(35, 400, 20, 230, 64);
    drawHouse(265, 400, 0, 255, 42);
    drawHouse(495,400, 0, 250, 63);
    drawHouse(725, 400, 0, 245, 84);
    drawHouse(955, 400, 0, 240, 105);
    drawHouse(35, 700, 0, 224, 169);
    drawHouse(265, 700, 0, 219, 191);
    drawHouse(495, 700, 0, 213, 212);
    drawHouse(725, 700, 0, 48, 234);
    drawHouse(955, 700, 29, 0, 255);
    
    // Draws the faces
    drawFace(5, 300, 29, 0, 255);
    drawFace(235, 300, 0, 48, 234);
    drawFace(465, 300, 0, 213, 212);
    drawFace(695, 300, 0, 219, 191);
    drawFace(925, 300, 0, 224, 169);
    drawFace(1155, 300, 0, 240, 105);
    drawFace(5, 600, 0, 245, 84);
    drawFace(235, 600, 0, 250, 63);
    drawFace(465, 600, 0, 255, 42);
    drawFace(695, 600, 20, 230, 64);
    drawFace(925, 600, 78, 153, 128);
    drawFace(1155, 600, 97, 128, 150);
    drawFace(5, 900, 116, 102, 171);
    drawFace(235, 900, 135, 77, 192);
    drawFace(465, 900, 154, 51, 213);
    drawFace(695, 900, 255, 0, 0);
    drawFace(925, 900, 0, 0, 255);
    drawFace(1155, 900, 0, 0, 255);

  }

  /** 
   * Draws a house
   * @author T. Chen
   * @param intHouseX is the starting x axis position for the base, roof, window, and door
   * @param intHouseY is the starting y axis position for the base, roof, window, and door
   * @param intRed is the red value within RBG 
   * @param intGreen is the green value within RBG 
   * @param intBlue is the blue value within RBG 
   */
	 
  public void drawHouse(int intHouseX, int intHouseY, int intRed, int intGreen, int intBlue) {
    
    // House Base
    stroke(0);
    fill(intRed, intGreen, intBlue); 
    rect(intHouseX, intHouseY, 200, 150);

    // House Roof
    fill(128, 0, 0); 
    triangle(intHouseX, intHouseY, intHouseX + 200, intHouseY, intHouseX + 100, intHouseY -100);

    // Door
    fill(93, 41, 6);
    rect(intHouseX + 140, intHouseY + 70, 40, 80);

    fill(247, 198, 107);
    ellipse(intHouseX + 170, intHouseY + 110, 10, 10);

    // Window
    fill(255, 255, 255);
    rect(intHouseX + 20, intHouseY + 40, 60, 60);
    line(intHouseX + 50, intHouseY + 40, intHouseX + 50, intHouseY + 100);
    line(intHouseX + 20, intHouseY + 70, intHouseX + 80, intHouseY + 70);

  

  }

  /**
   * Draws a face in between multiple houses
   * @author T. Chen
   * @param intFaceX is the starting location for the x axis of the face
   * @param intFaceY is the starting location for the y axis of the face
   * @param intRed is the red value within RBG 
   * @param intGreen is the green value within RBG 
   * @param intBlue is the blue value within RBG 
   */
public void drawFace(int intFaceX, int intFaceY, int intRed, int intGreen, int intBlue) {

  // Face Shape
  stroke(intRed, intGreen, intBlue);
  fill(255, 255, 255);
  ellipse(intFaceX + 17, intFaceY + 5, 75, 75);

  // Face Details
  stroke(intRed, intGreen, intBlue);
  fill(intRed, intGreen, intBlue);
  rect(intFaceX - 5, intFaceY, 10, 2);
  rect(intFaceX + 30, intFaceY, 10, 2);
  rect(intFaceX - 8, intFaceY + 10, 50, 3);


  }

/**
 * Gets the X and Y values of the mouse
 * @author T. Chen
 * @return the X and Y value of the mouses or location of the mouse
 */
public int MouseColour() {
  return get(mouseX, mouseY);
}
} 
  
  // define other methods down here.

