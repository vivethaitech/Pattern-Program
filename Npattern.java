package Practice;

public class Npattern {
	public static void main(String[] args)
	{
		for(int i=1;i<=9;i=i+1)
		{
			for(int j=1;j<=9;j=j+1)
			{
				if(j==1||j==9||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
	}

}
}