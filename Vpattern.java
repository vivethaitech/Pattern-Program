package Practice;

public class Vpattern {
	public static void main(String[] args)
	{
		for(int i=1;i<=9;i=i+1)
		{
			for(int j=1;j<=9;j=j+1)
			{
				if(i==j && i<=5||i+j==10 && i<=5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();

      }
		
	}

}
