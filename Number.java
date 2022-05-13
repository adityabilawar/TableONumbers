
public class Number
{
	private int theValue;
	
	public Number(int value)
	{
	//complete your constructor
		theValue = value;
	}	
	
	public int getValue()
	{
		return theValue;
	}
	
	public boolean equals(Object obj)
	{
	//number objects are equal if they contain equal values
	//and remember, your parameter is an object, so casting is necessary before comparison.
		return ((Number) obj).getValue() == theValue;
	} 
	
	public int hashCode()
	{
		return theValue%10;
	}

	public String toString()
	{
		return "" + theValue;
	}	
}