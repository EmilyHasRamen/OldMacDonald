class NamedCow extends Cow
{
	private String myName; 
	

	public NamedCow(String animalType, String animalName, String animalSound)
	{

		myType = animalType;
		myName = animalName;
		mySound = animalSound;

	}
	public NamedCow(String animalName)
	{

		myType = "unknown-cow";
		myName = animalName;
		mySound = "mute";
	}
	public NamedCow()     {         

		myType = "unknown";
        myName = "unknown";           
		mySound ="unknown";
     }      
	public String getName()
	{

		return myName;
	}
     
}