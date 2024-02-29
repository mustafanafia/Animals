//************************************************************************
// Student: Mustafa Nafia
// course: CIT-149
// Instructor: Cindy Tucker
// Date: 11/19/2018
//************************************************************************

public class Puppy extends Dog
{
	private char gender;
	private int ageInMonths;

	//***********************************************************************************
	//  Constructors
	//***********************************************************************************

	public Puppy(boolean isAlive, String dateOfBirth, String dateOfDeath, String description, String name, String breed, String size, char gender, int ageInMonths)
	{	super(isAlive, dateOfBirth, dateOfDeath, description, name, breed, size);
		this.gender = gender;
		this.ageInMonths = ageInMonths;
	}

	public Puppy()
	{	super();
		gender = ' ';
		ageInMonths = 0;;
		
	}

	//***********************************************************************************
	//  Accessors
	//***********************************************************************************


	public char getGender()
	{	return gender;	}

	public int getAgeInMonths()
	{	return ageInMonths;	}

	//***********************************************************************************
	//  Mutators
	//***********************************************************************************


	public void setGender(char gender)
	{	this.gender = gender;	}

	public void setAgeInMonths(int ageInMonths)
	{	this.ageInMonths = ageInMonths; 	}


	//***********************************************************************************
	//  Other Methods
	//***********************************************************************************

	public  String move()  //Abstract method overridden with details
	{	return "\n" + "\t" + "*** " + name + " is Max's Puppy and also from the " + breed + " family!" + " ***";
	}


	public String toString()
	{
		String phrase;
		phrase = super.toString() + "\n\n\t-----Data from puppy Child Class -----" + "\n\n\t"+ name +
		" is a Puppy\n\tAge: \t" + ageInMonths + " Months.";
		if (gender == 'm' || gender == 'M')
			phrase += "\n" + "\t" + "Gender: Male";
		else if (gender == 'f' || gender == 'F')
			phrase += "\n" + "\t" + "Gender: Female";
		else phrase += "\n" + "\t" + "Gender: Unknown";

		return phrase;

	}
}