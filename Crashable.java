public abstract class Crashable{
	boolean carDrivable = true;
	public void youCashed() {
		this.carDrivable = false;
	}
	
	public abstract void setCarStrength(int carStrength);
	public abstract int getCarStrength();
	
}