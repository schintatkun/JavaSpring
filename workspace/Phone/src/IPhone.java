
public class IPhone extends Phone implements Ringable {
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override
    public String ring() {
        return this.getRington();
    }
    @Override
    public String unlock() {
    	return "Unlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
        String output = String.format("Phone info : "+this.getVersionNumber()+" "+this.getBatteryPercentage()+" "+this.getCarrier()+" "+this.getRington());
    	System.out.println(output);         
    }
	
}
