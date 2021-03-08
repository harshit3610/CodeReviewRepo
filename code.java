package First;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Employee {
    int em_age;
    String em_name, em_designation, em_department;
    double em_salary;

    public Employee(int em_age, String em_name, String em_designation, String em_department, double em_salary) {
        this.em_age = em_age;
        this.em_name = em_name;
        this.em_designation = em_designation;
        this.em_department = em_department;
        this.em_salary = em_salary;
    }

   
}
    
     class Developer extends Employee{
        int developer_id;
        String[] pr_language;

        public Developer(int em_age, String em_name, String em_designation, String em_department, double em_salary, int developer_id, String[] pr_language) {
            super(em_age, em_name, em_designation, em_department, em_salary);
            this.developer_id = developer_id;
            this.pr_language = pr_language;
        }
      void  update_skills(String s)//Requesting new or additional skills to update
	  {
          // s=".net";
		  System.out.println("Enter the language or skill:");
		  ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));
		  System.out.println("Enter the element that is to be added:");
		  Scanner s = new Scanner(System.in);
		  myList.add(s);
		  this.pr_language = myList.toArray(myArray);
        }

        double rais_salary(double val)//changed the salary update to depend on val
        {
			this.em_salary=this.em_salary+val;
            //val=val+24789.12;
            return this.em_salary;
            
            //System.out.println();
        }
        void change_designation(String s)//Asking new designation and updating
		{
			System.out.println("Enter the new designation:");
			Scanner s = new Scanner(System.in);
            this.designation=s;
            
        }
        double display_salary(){
            return em_salary;
        }
    }
public class Lakshmisonikar {
    public static void main(String[] args) {
        Developer d1=new Developer(1,"laxmi","Tester","banking",23343.00,435, new String[]{"java", "html", "python"});
        d1.em_designation="Java 14";
        //double val = 0;
        d1.rais_salary(val);
        
    }
}
