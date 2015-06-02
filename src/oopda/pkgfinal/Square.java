import java.awt.*;

/**
 * A square that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class Square extends TwoDShape

{
    private int size;


    /**
     * Create a new square at default position with default color.
     */
    public Square()
    {
        size = 60;
        xPosition = 310;
        yPosition = 120;
        color ="red";
        isVisible = false;
    }

    
    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newSize)
    {
        erase();
        size = newSize;
        draw();
    }

 

    /**
     * Draw the square with current specifications on screen.
     */
    public void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                        new Rectangle(xPosition, yPosition, size, size));
            canvas.wait(10);
        }
    }
    
    public double getArea(){
      return size*size  ;
    }

}
