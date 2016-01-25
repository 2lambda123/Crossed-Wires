import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileInput 
{

	public FileInput()
	{
	}
	
	public void runFile(String dataset)
	{
		File f= new File(dataset);
		try{
			Scanner fileContents = new Scanner(f);
			getIntersections(fileContents);
			fileContents.close();
			
		}catch(FileNotFoundException e){
			System.out.format("%s was not Found in %s",f, System.getProperty("user.dir"));
			e.printStackTrace();
		}
	}

	private void getIntersections(Scanner data) 
	{
		int cases=data.nextInt();
		for(int i=1; i<=cases;i++)
		{
			Intersections crosses= new Intersections();
			System.out.format("Case #%d: ", i);
			int number_of_wires= data.nextInt();
			for(int j=0; j<number_of_wires; j++)
			{
				int right=data.nextInt();
				int left=data.nextInt();
				Wire w= new Wire(right,left);
				crosses.setWires(w);
			}
			System.out.format("%d\n", crosses.getCrosses());
		}
		
	}

}
