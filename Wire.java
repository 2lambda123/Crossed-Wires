
public class Wire 
{
	private int rightBuildingFloor;
	private int leftBuildingFloor;
	public Wire()
	{
		rightBuildingFloor=0;
		leftBuildingFloor=0;
	}
	
	public Wire(int r,int l)
	{
		rightBuildingFloor=r;
		leftBuildingFloor=l;
	}

	public int getRight()
	{
		return rightBuildingFloor;
	}
	public int getLeft()
	{
		return leftBuildingFloor;
	}
	public String toString()// this method if for debugging
	{
		return "("+String.valueOf(rightBuildingFloor)+", "+String.valueOf(leftBuildingFloor)+")";
	}
}
