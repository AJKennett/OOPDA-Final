import java.awt.*;
import java.awt.geom.*;
import java.awt.Color;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

/**
 * Write a description of class TwoDShape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract  class TwoDShape
{
    // instance variables - replace the example below with your own
    
   protected int xPosition;
   protected int yPosition;
   protected String color;
   protected boolean isVisible;
   protected Color col;
   
    /**
     * Constructor for objects of class TwoDShape
     */
    public TwoDShape()
    {
        // initialise instance variables
      
    }

   public abstract  void draw();
    /**
     * Make this circle visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
  
   
    /**
     * Make this triangle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    /**
     * Move the triangle a few pixels to the right.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the triangle a few pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the triangle a few pixels up.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the triangle a few pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the triangle horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the triangle vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the triangle horizontally by 'distance' pixels.
     * @param the int number of pixels to move 
     */
    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            xPosition += delta;
            draw();
        }
    }

    /**
     * Slowly move the triangle vertically by 'distance' pixels.
     * @param the int number of pixels to move 
     */
    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            yPosition += delta;
            draw();
        }
    }
    
        /**
     * Erase the triangle on screen.
     */
    protected void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    
    
     /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }
    
     /**
     * returns string corresponding to color of shape
     * 
     * @return string value of color
     */
    public String getColor()
    {
        
        return this.color;
    }
    
   public double getArea(){
       
       return 2;
    }
    
}
