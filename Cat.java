//************************************************************************
// Student: Mustafa Nafia
// course: CIT-149
// Instructor: Cindy Tucker
// Date: 11/19/2018
//************************************************************************

public class Cat extends LivingCreature
{
    private String name;
    private String color;
    private char gender;


    //***********************************************************************************
    //  Constructors
    //***********************************************************************************

    public Cat(boolean isAlive, String dateOfBirth, String dateOfDeath, String description, String name, String color, char gender)
    {   super(isAlive, dateOfBirth, dateOfDeath, description);
        this.name = name;
        this.color = color;
        this.gender = gender;
    }

    public Cat()
    {   super();
        name = "Unknown";
        color = "Unknown";
        gender = ' ';
    }

    //***********************************************************************************
    //  Accessors
    //***********************************************************************************
    
    public String getName()
    {        return name;   }
    
    
    public String getColor()
    {       return color;   }


    public char getGender()
    {   return gender;  }

    //***********************************************************************************
    //  Mutators
    //***********************************************************************************
    
    
    
    public void setName(String name)
    {    this.name = name;   }
    
    
    public void setColor(String color)
    {   this.color = color; }


    public void setGender(char gender)
    {   this.gender = gender;   }



    //***********************************************************************************
    //  Other Methods
    //***********************************************************************************

    public  String move()  //Abstract method overridden with details
    {   return "\n" + "\t" + "*** " + name + " has the color " + color + " and that is a beautiful cat color!" + " ***";
    }


    public String toString()
    {
        String phrase;
        phrase = super.toString() + "\n\n\t-----Data from Cat Child Class -----" + "\n\n\t" + name + " is a cat" + "\n\t"+ "Name: " + "\t" + name
        + "\n\t" + "Color: " + "\t" + color;
        if (gender == 'm' || gender == 'M')
            phrase += "\n" + "\t" + "Gender: Male";
        else if (gender == 'f' || gender == 'F')
            phrase += "\n" + "\t" + "Gender: Female";
        else phrase += "\n" + "\t" + "Gender: Unknown";

        return phrase;

    }
}