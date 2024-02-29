//************************************************************************
// Student: Mustafa Nafia
// course: CIT-149
// Instructor: Cindy Tucker
// Date: 11/19/2018
//************************************************************************

abstract public class LivingCreature
{
	private boolean isAlive;
	private String dateOfBirth;
	private String dateOfDeath;
	private String description;

	//***********************************************************************************
	//  Constructors
	//***********************************************************************************

	public LivingCreature(boolean isAlive, String dateOfBirth, String dateOfDeath, String description)
	{	this.isAlive = isAlive;
		this.dateOfBirth = dateOfBirth;
		this.dateOfDeath = dateOfDeath;
		this.description = description;
	}

	public LivingCreature()
	{	this.isAlive = true;
		this.dateOfBirth = "Unknown";
		this.dateOfDeath = "Unknown";
		this.description = "Unknown";
	}

	//***********************************************************************************
	//  Accessors
	//***********************************************************************************

	public boolean checkIsAlive()
	{		return isAlive;	}

	public String getDateOfBirth()
		{	return dateOfBirth;	}


	public String getDateOfDeath()
	{	return dateOfDeath;	}

	public String getDescription()
	{	return description;	}

	//***********************************************************************************
	//  Mutators
	//***********************************************************************************

	public void setIsAlive(boolean isAlive)
	{	this.isAlive = isAlive;	}

	public void setDateOfBirth(String dateOfBirth)
	{	this.dateOfBirth = dateOfBirth;	}

	public void setBirthYear(String dateOfDeath)
	{	this.dateOfDeath = dateOfDeath;	}

	public void setDescription(String description)
	{	this.description = description;	}

	//***********************************************************************************
	//  Other Methods
	//***********************************************************************************

	public abstract String move();  //Abstract method to be defined by derived classes

	public String toString()
	{
		String phrase;
		phrase = "\n\n\t-----Data from LivingCreature parent class-----" + "\n\n\tLiving Thing:\t" + description +
		"\n\tAlive?\t\t\t" + isAlive + "\n\tBirth Date: \t\t" + dateOfBirth +
				"\n\tDeath Date:\t\t" + dateOfDeath;
		return phrase;

	}
}