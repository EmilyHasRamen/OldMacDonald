class NamedCow extends Cow
{
	private String myName; 
	private String mySound; 
	private String myType;
	public NamedCow(String animalType, String animalName, String animalSound)
	{
//System.out.println("I'm in NamedCow(String animalType, String animalName, String animalSound)");
		myType = animalType;
		myName = animalName;
		mySound = animalSound;
//System.out.println("myType="+myType+", myName="+myName+", mySound="+mySound);
	}
	public NamedCow(String animalName)
	{
//System.out.println("I'm in NamedCow(String animalName)");
		myType = "unknown-cow";
		myName = animalName;
		mySound = "mute";
	}
	public NamedCow()     {         
//System.out.println("I'm in NamedCow()");
		myType = "unknown";
        myName = "unknown";           
		mySound ="unknown";
     }      
	public String getName()
	{
//System.out.println("NamedCow(animalType, animalName, animalSound).getName(): myName="+myName+", myType="+myType+", mySound="+mySound);
		return myName;
	}
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
