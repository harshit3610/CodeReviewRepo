import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Student
{
    String name;
	int id;
	double percentage;
	String[] skills;

	public Student(String name, int id, double percentage, String[] skills)
	{
		this.name=name;
		this.id=id;
		this.percentage=percentage;
		this.skills=skills;
	}

    public Student(String name, int id)
	{
        this.name=name;
		this.id=id;
    }
	public Student(int id, double percentage)
	{
		this.id=id;
		this.percentage=percentage;
	}
	public Student(String name, int id, String[] skills)
	{
		this.name=name;
		this.id=id;
		this.skills=skills;
	}
   public String getName()
   {
		return this.name;

   }
   public int getId()
   {
		return this.id;

   }
   public double getPercentage()
   {
		return this.percentage;

   }
   public String getSkills()
   {
		return Arrays.toString(this.skills);

   }
      public void setName(String name)
   {
		this.name=name;

   }
   public void setId(int id)
   {
		this.id=id;

   }
   public void setPercentage(double percentage)
   {
		this.percentage=percentage;

   }
	public void  update_skills(String s)
	  {
		  ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));
		  myList.add(s);
		  this.skills = myList.toArray(myArray);
        }
}

//write more comments
//proper indentations to be done