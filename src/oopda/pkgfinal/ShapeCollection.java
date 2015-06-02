import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
/**
 * Modified ArrayList for holding TwoDShape objects, performs functions like add,delete and sort
 * 
 * @author Aadam Kennett
 * @version 2/11/13
 */
public class ShapeCollection

{
    // instance variables - replace the example below with your own
  private ArrayList<TwoDShape> shapes = new ArrayList();
   protected ArrayList<TwoDShape> OrderedShapes = new ArrayList();
  
   /**Creates Arraylist with added functionality
     * 
     *
     */
    public ShapeCollection()
    {
        // initialise instance variables

    }
    
    /**Adds an element to the ShapeCollection arraylist
     * 
     *@param The TwoDShape object to be added
     */
    public void addElem(TwoDShape shape){
         shapes.add(shape);
         OrderedShapes.add(shape);
    }
    
    /**Removes element from ShapeCollection arraylist
     * 
     *@param The TwoDShape object to be removed
     */
    public TwoDShape removeElem(TwoDShape s){
        if( shapes.contains(s));{
            shapes.remove(shapes.indexOf(s));
        }
        
        return s;
    }

   
    
   
      
         /**Draws all TwoDShape objects in given Arraylist
     * 
     *@param The Arraylist of TwoDShape objects to be displayed
     *@return 
     */
   public  void drawAll(){
       for(TwoDShape d: shapes){
           d.draw();
           d.makeVisible();
           try {
               Thread.sleep(1000);
            } catch(InterruptedException e) {
            } 
         
        }
        
       
      }
      
     
      /**Sorts ShapeCollection arraylist by area from least to greatest then prints in that order
     * 
     *
     */
      public void drawInIncreasingArea(){
        
         areaSort(OrderedShapes);
          for(TwoDShape d: OrderedShapes){
           d.draw();
           d.makeVisible();
           try {
               Thread.sleep(1000);
            } catch(InterruptedException e) {
            } 
         
        }
         
   }
   
    /**Sorts a TwoDShape array list by color, alphabetically from a to z
     * 
     *@return the smallest area TwoDShape in the ArrayList
     */
   public void sortByColor()
   {
       sortColor(OrderedShapes);
       
    }

     /**
   * sorts List of TwoDShapes by color String
   * 
   * @param:List to be sorted
   * @return:N/A
   */
       public void sortColor(ArrayList<TwoDShape> s){
        int i = 0;
        int j = 0;
        while ( j < s.size()){//loops s.size() times
            
        while(i+2 <= s.size()){//compares first 2 elements and swaps if first element is less than 2nd
     
            if(s.get(i+1).getColor().compareTo(s.get(i).getColor()) < 0)
            swapp(s,(i+1),(i));
            i++;//move on to next element
            
        }
        j++;//keeps track of numbers compares, makes sure each element is compared
        i=0;
    }
        
    }
   
   /**Sorts a TwoDShape array list from smallest area to largest and returns smallest
     * 
     *@return the smallest area TwoDShape in the ArrayList
     */
   public  TwoDShape  getElementWithSmallestArea(){
      
       areaSort(OrderedShapes);
 
      return OrderedShapes.get(0);
    }
  
    /**Sorts a TwoDShape array list from smallest area to largest
     * 
     *@param The TwoDShape ArrayList to be sorted
     */
        
     public static ArrayList<TwoDShape> areaSort( ArrayList<TwoDShape> s )
     {
     int j;
     boolean swap = true;   
     

     while ( swap )
     {
            swap= false;   
            for( j=0;  j < s.size() -1;  j++ )
            {
                   Collections.sort(s, new AreaComparator())   ;
                  
            } 
            
            
      } 
      
      return s;
   } 

   
       /**sorts ArrayList then calls searchColor method, provides all parameters besides the key
     * 
     *@param the color String you are searching for
     *@return the index of the color String
     */
   public int findColor(String key)
   {
       sortByColor();
       return searchColor(OrderedShapes,key,0,shapes.size());
       
    }
   
    /**searches through sorted List of TwoDShapes
     * 
     *@param the color String you are searching for
     *@return the index of the color String being searched for
     */
   public int searchColor(ArrayList<TwoDShape> s, String key, int min, int max)
   { 
     
       
       if(max <min)
       {
       return -1;
       //not in string
      } 
       
        int mid = min + ((max-min)/2);
      
           
        
     //if color of current mid > color being searched for  
     String test = s.get(mid).getColor();
     if(s.get(mid).getColor().compareTo(key) > 0)
     {
     return searchColor(s,key,min,mid-1);
     }
      //if color of current mid < color being searched for   
     else if(s.get(mid).getColor().compareTo(key) < 0)
     {
      //   
      return searchColor(s,key,mid+1,max);   
     }
     //if color mid = color key
     else
     {
    
      return mid;   
      }
     
     
     
    }


    /**
    * swap method, swaps positions of two elements in any List
    * 
    * 
    * @param:List containing two elements to be swapped, element1, element2
    * @return N/A
     */
                public  void swapp(ArrayList<TwoDShape> s, int p1, int p2)
     {
         Object temp = s.get(p1);
         s.set(p1,s.get(p2));
         s.set(p2,(TwoDShape)temp);
     
         
         
         
        
   }
    
}
