//************************************************************************
// Student: Mustafa Nafia
// course: CIT-149
// Instructor: Cindy Tucker
// Date: 11/19/2018
//************************************************************************

public class Dog extends LivingCreature
{
    protected String name;        
    protected String breed;
    protected String size;

    //***********************************************************************************
    //  Constructors
    //***********************************************************************************

    public Dog(boolean isAlive, String dateOfBirth, String dateOfDeath, String description, String name, String breed, String size)
    {   super(isAlive, dateOfBirth, dateOfDeath, description);
        this.name = name;
        this.breed = breed;
        this.size = size;
    }

    public Dog()
    {   super();
        name = "Unknown";
        breed = "Unknown";
        size = "Unknown";
    }

    //***********************************************************************************
    //  Accessors
    //***********************************************************************************
    
    
    
    public String getName()
    {        return name;   }
    
    
    public String getBreed()
    {       return breed;   }

    public String getSize()
        {   return size;    }

    //***********************************************************************************
    //  Mutators
    //***********************************************************************************

    public void setName(String name)
    {    this.name = name;   }
    
    
    public void setBreed(String breed)
    {   this.breed = breed; }

    public void setSize(String size)
    {   this.size = size;   }



    //***********************************************************************************
    //  Other Methods
    //***********************************************************************************

    public  String move()  //Abstract method overridden with details
    {   return "\n" + "\t" + "*** " + name + " is a PitBull dog which is from the " + breed + " family!" + " ***";
    }


    public String toString()
    {
        String phrase;
        phrase = super.toString() + "\n\n\t-----Data from dog Child Class -----" + "\n\n\t"+ name +
        " is a dog\n\tName: \t" + name + "\n\tBreed: \t" + breed + "\n\tSize: \t" + size;


        return phrase;

    }
}