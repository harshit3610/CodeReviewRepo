import java.util.*;


// it is class which inherits its properties from class Operations

class DisplayOperations extends Operations
{
    public void showAttributes() //method to display all attributes
    {
	System.out.prinltn(this.id); //displays id
	System.out.prinltn(this.name); //displays name
	System.out.prinltn(this.percentage); // displays percentage
	System.out.prinltn(this.skills); // displays skills
    }
    public void showNAME()  // method to show name in UPPERCASE
    {
        System.out.prinltn(this.name.toUpperCase()); //prints name in UPPERCASE
    }
    public void showDifference(Student s2) // method to compare percentage of two different students
    {
        System.out.prinltn(this.percentage-s2.percentage); //prints difference of percentage of two students
    }
}

