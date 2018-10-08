public class MutableInteger
{
	private int intValue;
	public MutableInteger()
	{
		this(0);	
	}
	public MutableInteger(int intValue)
	{
		this.intValue=intValue;
	}
	
	public void setIntegerValue(int intValue)
	{
		this.intValue=intValue;
	}
	public int getIntegerValue()
	{
		return this.intValue;
	}
}