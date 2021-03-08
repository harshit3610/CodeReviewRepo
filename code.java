package First;
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
    
    public Employee(Employee e){
        this.em_age = e.em_age;
        this.em_name = e.em_name;
        this.em_designation = e.em_designation;
        this.em_department = e.em_department;
        this.em_salary = e.em_salary;
    }
    
   
}
    
     class Developer extends Employee{
        int developer_id;
        ArrayList<String> pr_language = new ArrayList<String>;

        Developer(int em_age, String em_name, String em_designation, String em_department, double em_salary, int developer_id, String[] pr_language) {
            super(em_age, em_name, em_designation, em_department, em_salary);
            this.developer_id = developer_id;
            this.pr_language = pr_language;
        }
      void update_skills(String s){
           pr_language.add(s);
        }

        void rasie_salary(double val)
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
        Developer(Developer d){
            Employee e = new Employee(d.em_age, d.em_name, d.em_designation, d.em_department, d.em_salary);
            super(Employee e)
            this.developer_id = d.developer_id;
            this.pr_language = d.pr_language;
         }
                                      
        public static void main(String[] args) {
            Developer d1 = new Developer(1, "Aki Singh", "Analyst", "Insights Center", 23343.00, 435,new ArrayList<String>() {{
                        add(".Net");
                        add("C#");
                        add("Python");
                    }};);
            d1.update_skills("Java 14");
            d1.raise_salary(24789.12);
            d1.display_salary();
        
    }
    }
