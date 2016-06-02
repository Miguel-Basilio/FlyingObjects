
public class Airplane extends Air{

	public Airplane(int year, String make, String model, String color, String name, int numOfGears) {
		super(year, make, model, color, name, numOfGears);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Fly(int oCycle) {
		// TODO Auto-generated method stub
		{
			setCycle(oCycle);
			if (getGear() < getNumOfGears())
			{
				upGear();
				setSpeed(getGear()*450);
			}
			
			setDistanceTraveled (getDistanceTraveled() + getSpeed()/60.0);
		}
	}


}
