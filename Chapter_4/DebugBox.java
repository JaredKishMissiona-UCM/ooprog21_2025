import java.util.Scanner;

public class DebugBox
{
    private int width;
    private int length;
    private int height;

   
    public DebugBox(int width, int length, int height)
    {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    
    public void showData()
    {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

    
    public double getVolume()
    {
        return length * width * height;
    }

  
    public static void main(String[] args)
    { 
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter width: ");
        int width = scanner.nextInt();
        
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        
        System.out.print("Enter length: ");
        int length = scanner.nextInt();

        
        DebugBox box = new DebugBox(width, height, length);

       
        box.showData();

       
        System.out.println("Volume: " + box.getVolume());
    }
}
