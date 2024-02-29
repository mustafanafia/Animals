//********************************************************************
// Student: Mustafa Nafia
// course: CIT-149
// Instructor: Cindy Tucker
// Date: 11/19/2018
//********************************************************************


public class Drive {
    public static void main(String[] args) {
        

        
        Cat myCat = new Cat(true,"05/14/2018", "", "Persian cat", "Coco", "Gray", 'M');
        
        Dog myDog = new Dog(false,"09/5/2016", "06/4/2018", "American Pit Bull Terrier", "Max", "Canidae", "Medium");
        
        Puppy myPuppy = new Puppy(true,"07/5/2017", "", "American Pit Bull Terrier", "Bella", "Canidae", "Small", 'F', 6);
        
        
        System.out.println("Printing object named My Cat" + myCat);
	System.out.println(myCat.move() + "\n\n");
	  

	System.out.println("Printing object named My Dog" + myDog);	
	System.out.println(myDog.move() + "\n\n");
	
	
	System.out.println("Printing object named My Puppy" + myPuppy);
	System.out.println(myPuppy.move() + "\n\n");
	  
    }
}
