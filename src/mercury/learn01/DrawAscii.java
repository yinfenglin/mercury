package mercury.learn01;

public class DrawAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		drawCircle(16,14,10,2, "*");
	}
	
	public static void drawCircle(int centerX, int centerY, int radius, int thickness, String symbol)   
	{  
	  for (int j = 0; j<centerX + radius + thickness;j++)
	  {
	    for (int i = 0; i<centerX + radius+ thickness; i++)
	    {
	      if ( Math.abs(Math.pow(Math.pow(i-centerX,2) + Math.pow(j-centerY,2),.5) - radius) < thickness)
	      {
	        System.out.print(symbol);
	      }
	      else
	      {
	        System.out.print(" ");
	      }
	    }
	    System.out.println("");
	  }
	}

}
