   public class DebugPen
 {
      private String color;
      private String point;
      
      public DebugPen(String color, String point )
   {
      this.color = color ;
      this.point = point ;
   }
   
   
   
   public String getColor()
   {
      return color;
   }
   
   
   public String getPoint()
   {
      return point;
   }
   
   public static void main(String[] args){
        DebugPen debugPen = new DebugPen("blue","fine");
        
        System.out.println("Pen Color:" + debugPen.getColor() +  "\n Pen point:"+ debugPen.getPoint());  
   }
 }
   