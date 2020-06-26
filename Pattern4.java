package Star_Pattern;

public class Pattern4 {

	public static void main(String[] args) 
	{
		String str="*";
		int lines=5;
		
		for(int i=1; i<=lines; i++)
		{
			System.out.print((str));
			str= str + "*";
			System.out.println();
		}
		
	}
}