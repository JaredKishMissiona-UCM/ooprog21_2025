

public class DebugCircle 
{
    private int radius;
    private int diameter;
    private double area;
    private static final double PI = 3.14159;

    
    public DebugCircle(int r) 
    {
        radius = r;
        diameter = 2 * radius;
        area = PI * radius * radius;
    }

    public int getRad()
    {
        return radius;
    }
    
    public int getDiam()
    {
        return diameter;
    }
    
    public double getArea()
    {
        return area;
    }
}