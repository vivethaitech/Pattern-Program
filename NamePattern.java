package Practice;
public class NamePattern {
	public static void main(String[] args)
	{   //v
		for(int i=1;i<=5;i=i+1)
		{
			for(int j=1;j<=9;j=j+1)
			{
				if(i==j ||i+j==10)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
      }
		System.out.println();
		//I
		for(int i=1;i<=7;i=i+1)
		{
			for(int j=1;j<=9;j=j+1)
			{
				if(i==1||j==5||i==7)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
      }
		System.out.println();
		//V
		for(int i=1;i<=5;i=i+1)
		{
			for(int j=1;j<=9;j=j+1)
			{
				if(i==j ||i+j==10)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
      }
		//E
		System.out.println();
		for(int i=1;i<=9;i=i+1)
		{
			for(int j=1;j<=9;j=j+1)
			{
				if(i==1 ||i==9||i==5||j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
        }
		System.out.println();
		//T
		for(int i=1;i<=7;i=i+1)
		{
			for(int j=1;j<=9;j=j+1)
			{
				if(i==1 ||j==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
        }
		System.out.println();
		//H
		for(int i=1;i<=9;i=i+1)
		{
			for(int j=1;j<=9;j=j+1)
			{
				if(i==5 ||j==1||j==9)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
        }
		System.out.println();
		//A
		 for(int i = 1; i <= 9; i++) {
	          for( int j = 1; j <= 9; j++) {
	            if(!((i == 1 && j == 1) || (i == 1 && j == 9)) && (i == 1  || i == 5 || j == 1 || j == 9 )) 
	                System.out.print("*");
	            else 
	                System.out.print(" ");
	            
	            }
	         System.out.println();
	        }
	}
}
