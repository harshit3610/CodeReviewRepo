package First;
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
      void  update_skills(String s){
           s=".net";
          
        }
    
         Developer(Developer d) //added copy constructor
         {this.em_age = d.em_age;
        this.em_name = d.em_name;
        this.em_designation = d.em_designation;
        this.em_department = d.em_department;
        this.em_salary = d.em_salary;
         this.developer_id = d.developer_id;
            this.pr_language = d.pr_language;
         }
         
        double rais_salary(double val) //corrected method
        {
            em_salary=em_salary+val;
           
            
           // System.out.println();
        }
        void change_designation(String s) //corrected method
        {
            em_designation=s;
            
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
        d1.rais_salary(24789.12);
        System.out.println(""+ d1.em_salary);
        Developer backup= new Developer(d1); //created backup
        backup.developer_id=2; //update backup
        
        
    }
}
