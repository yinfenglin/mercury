package mercury.learn01;

public class DrawAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//drawCircle(16,14,10,2, "*");
		//drawChristmasTree();
		drawChristmasTree();
	}
	
	public static void drawSandClock() {
		
	}
	
	public static void drawRocket()
	{
		drawTriangle(3,10,"*");
		drawRectangle(5,10,10,"*");
		drawTrapezoid(3,5,8,"*");
		System.out.println("");
		drawTriangleInverse(3,10,"*");
	}
	
	public static void drawChristmasTree()
	{
		drawTriangle(3,10,"*");
		drawTrapezoid(2,5,8,"*");
		drawTrapezoid(4,7,6,"*");
		drawRectangle(3,5,11,"*");
	}
	
	public static void drawTriangle(int size, int offset, String symbol)
	{
		for (int i = 1; i <= size; i++)
		{
			for (int j = 1; j <= size - i + offset; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i - 1; k++)
			{
				System.out.print(symbol);
			}
			System.out.println("");
		}
	}
	
	public static void drawTriangleInverse(int size, int offset, String symbol)
	{
		for (int i = 1; i <= size; i++)
		{
			for (int j = 1; j <= i - 1 + offset; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*(size-i) + 1; k++)
			{
				System.out.print(symbol);
			}
			System.out.println("");
		}
	}

	public static void drawTrapezoid(int smallBase, int bigBase, int offset, String symbol)
	{
		for (int i = smallBase; i <= bigBase; i++)
		{
			for (int j = 1; j <= bigBase - i + offset; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i - 1; k++)
			{
				System.out.print(symbol);
			}
			System.out.println("");
		}
	}
	
	public static void drawRectangle(int length, int height, int offset, String symbol)
	{
		for (int i = 1; i <= height; i++)
		{
			for (int j = 1; j <= length + offset; j++)
			{
				if (j <= offset)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(symbol);
				}
			}
			System.out.println("");
		}
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
