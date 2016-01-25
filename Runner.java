import java.util.Scanner;


public class Runner {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Run small inputs or large input?");
		System.out.println("Enter 'small' or 'large'");
		FileInput f= new FileInput();
		String file=s.next();
		if(file.contains("small"))
		{
			f.runFile("A-small-practice.in");
		}
		if(file.contains("large"))
		{
			f.runFile("A-large-practice.in");
		}
		
		
		s.close();

	}

}
