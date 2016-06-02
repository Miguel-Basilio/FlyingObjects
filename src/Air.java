
public abstract class Air implements Fly{

	private int year;
	private String make;
	private String model;
	private String color;
	private String name;
	private int nGears;
	private int cGear=0;
	private int oCycle=0;
	private double cSpeed=0;
	private double dTraveled=0.0;

	public Air (int year, String make, String model, String color, String name, int numOfGears)
	{
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;
		this.name = name;
		this.nGears = numOfGears;
	}
	
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setNumOfGears (int numOfGears)
	{
		this.nGears = numOfGears;
	}
	public int getNumOfGears()
	{
		return nGears;
	}
	public void setCycle(int cycle)
	{
		oCycle = cycle;
	}
	public int getOperatingCycle()
	{
		return oCycle;
	}
	public void upGear ()
	{
		cGear++;
	}
	public double getDistanceTraveled()
	{
		return dTraveled;
	}
	public void setDistanceTraveled (double n)
	{
		dTraveled = n;
	}
	public void setCurrentGear (int c)
	{
		cGear = c;
	}
	public int getGear()
	{
		return cGear;
	}
	public void setSpeed(double n)
	{
		cSpeed = n;
	}
	public double getSpeed()
	{
		return cSpeed;
	}
	
	public String toString()
	{
		return String.format("\nInfo: : %d,  %s,  %s,  %s,  %s, Velocity: %d, Flight Number: %d,"
				+ " Gear: %d, Speed: %.0f, Distance Traveled: %.2f", 
				year, make, model, color, name, nGears, oCycle, cGear, cSpeed, dTraveled);
 	}

}