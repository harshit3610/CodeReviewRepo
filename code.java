package first;
import java.util.Scanner;
import java.util.ArrayList;
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
    
    public Employee(Employee e){ // copy constructor
        this.em_age = e.em_age;
        this.em_name = e.em_name;
        this.em_designation = e.em_designation;
        this.em_department = e.em_department;
        this.em_salary = e.em_salary;
    }
    
   
}
    
    class Developer extends Employee{
        int developer_id;
        ArrayList<String> pr_language = new ArrayList<String>();// for simplified insertion deletion

        Developer(int em_age, String em_name, String em_designation, String em_department, double em_salary, int developer_id, ArrayList<String> pr_language) {
            super(em_age, em_name, em_designation, em_department, em_salary);
            this.developer_id = developer_id;
            this.pr_language = pr_language;
        }
        // Required functions are added
      void update_skills(String s){
           pr_language.add(s);
        }

        void raise_salary(double val)
        {
            this.em_salary += val;
            
            //System.out.println();
        }
        void change_designation(String s){
            this.em_designation = s;
            
        }
        void display_salary(){
            System.out.println(this.em_salary);
        }
        Developer(Developer d, int id){ // copy constructor
            super(new Employee(d.em_age, d.em_name, d.em_designation, d.em_department, d.em_salary));
            this.developer_id = id;
            this.pr_language = d.pr_language;
         }
                                      
        
    }
   public class Lakshmi{ // driver class
    public static void main(String[] args) {
            Developer d1 = new Developer(36, "Aki Singh", "Analyst", "Insights Center", 23343.00, 1 ,new ArrayList<String>() {{
                        add(".Net");
                        add("C#");
                        add("Python");
                    }});
            d1.update_skills("Java 14");
            d1.raise_salary(24789.12);
            d1.display_salary();
            Developer d2 = new Developer(d1, 2);
            System.out.println("Developer One Info");
            System.out.println(d1.developer_id);
            System.out.println(d1.em_name);
            System.out.println(d1.em_designation);
            System.out.println(d1.em_department);
            System.out.println(d1.em_salary);
            System.out.println(d1.em_age);
            System.out.println(d1.pr_language);
            System.out.println("Developer Two Info");
            System.out.println(d2.developer_id);
            System.out.println(d2.em_name);
            System.out.println(d2.em_designation);
            System.out.println(d2.em_department);
            System.out.println(d2.em_salary);
            System.out.println(d2.em_age);
            System.out.println(d2.pr_language);
        
        }
    }
