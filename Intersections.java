import java.util.ArrayList;
import java.util.List;


public class Intersections 
{
	private List<Wire> wireSet= new ArrayList<Wire>();
	private int crosses;
	
	public Intersections()
	{
		crosses=0;
	}
	public void setWires(Wire w)
	{
		if(wireSet.isEmpty())
		{
			wireSet.add(w);
		}
		else
		{
			for(Wire wires: wireSet)
			{
				if(w.getRight()>wires.getRight()&&
				   w.getLeft()<wires.getLeft()||
				   w.getRight()<wires.getRight()&&
				   w.getLeft()>wires.getLeft())
				{
					crosses++;
				}
			
			}
			wireSet.add(w);
		}
		
	}

		public int getCrosses()
	{
		return crosses;
	}
		public String toString()// this method if for debugging
		{
			String s = "";
			for(Wire w: wireSet)
			{
				s+=w.toString()+"\n";
			}
			return s;
		}
}
