package First;
class Employee {
    // Declare data member as protected.
    public int em_age;
    public String em_name, em_designation, em_department;
    public double em_salary;

    public Employee(int em_age, String em_name, String em_designation, String em_department, double em_salary) {
        this.em_age = em_age;
        this.em_name = em_name;
        this.em_designation = em_designation;
        this.em_department = em_department;
        this.em_salary = em_salary;
    }
   
    // Creating a Copy constructor
    public Employee(Employee emp)
    {
        this.em_age = emp.em_age;
        this.em_name = emp.em_name;
        this.em_designation = emp.em_designation;
        this.em_department = emp.em_department;
        this.em_salary = emp.em_salary;
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
      void  update_skills(String s){
           s=".net";
          // Insert s into pr_language array.
        }

        double rais_salary(double val)
        {
            // Incorrect syntax
            //val=em_salary+=24789.12;
            em_salary += val;  // em_salary is updated.
            return em_salary;
            
            //System.out.println(); // Unnecessary comment line.
        }
         
         
        void change_designation(String s){
            
            // Implemenation Missing.
            em_designation = s;
            
        }
        double display_salary(){
            return em_salary;
        }
    }
public class Lakshmisonikar {
    public static void main(String[] args) {
        Developer d1=new Developer(1,"laxmi","Tester","banking",23343.00,435, new String[]{"java", "html", "python"});
        
        // designation can a be updated using change_designation method.
         d1.change_designation("Java 14");
       // d1.em_designation="Java 14";
        double val = 0; // This line should not be commented.
        
      
        // rais_salary method returning double value.
        val = d1.rais_salary(24789.12);
        
    }
}
