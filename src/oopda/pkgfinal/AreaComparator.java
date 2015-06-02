import java.util.Comparator;
/**
 * Write a description of class ComparatorB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class AreaComparator implements Comparator<TwoDShape>
{
 

    /**
     * Constructor for objects of class ComparatorB
     */
    public AreaComparator()
    {
     
    }
    
    public int compare(TwoDShape s1, TwoDShape s2)
    {
        
        if(s1.getArea() < s2.getArea())
        return -1; //false
        if (s1.getArea() > s2.getArea())
        return 1;
        
        return 0;
        
        
    }

  
}
