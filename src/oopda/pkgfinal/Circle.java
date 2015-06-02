import java.awt.*;
import java.awt.geom.*;
import java.lang.Math;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class Circle extends TwoDShape
{
    private int diameter;
    
    /**
     * Create a new circle at default position with default color.
     */
    public Circle()
    {
        diameter = 68;
        xPosition = 230;
        yPosition = 90;
        color = "blue";
    }
    
      public void draw()
    {
   
         
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, this.color, new Ellipse2D.Double(xPosition, yPosition, 
                                                          diameter, diameter));
            canvas.wait(10);
        }

    
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newDiameter)
    {
        erase();
        diameter = newDiameter;
        draw();
    }
    
   public double getArea(){
       
      return ((diameter/2)*(diameter/2)) * Math.PI;
    }



    /**
     * Draw the circle with current specifications on screen.
     */


}
