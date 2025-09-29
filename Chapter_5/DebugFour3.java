// Box Interface Class: DebugBox.java

public class DebugBoxFour3 
{
 
    private double width;
    private double length;
    private double height;
    
    
    private static final double DEFAULT_DIMENSION = 1.0;

    
    public DebugBox() 
    {
        this(DEFAULT_DIMENSION, DEFAULT_DIMENSION, DEFAULT_DIMENSION);
    }

    public DebugBox(double w, double l, double h) 
    {
        width = w;
        length = l;
        height = h;
    }

    public void showData() 
    {
        System.out.println("Width: " + width + ", Length: " + length + ", Height: " + height);
    }

    public double getVolume() 
    {
        return width * length * height;
    }
}