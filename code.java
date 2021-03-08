package First;
class Employee {
    
    //@author(nlama700) these data members should be specified as protected
    
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

    //@author(nlama700) add copy constructor
   
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
           //@author(nlama700) this method should append 's' to 'pr_language'
        }

        double rais_salary(double val) //@author(nlama700) typo in name
        {
            val=em_salary+=24789.12;
            return val;
            
            //@author(nlama700) this method should increase 'em_salary' by 'val'
            //@author(nlama700) there should not return a value
            
            //System.out.println();
        }
        void change_designation(String s){
            
            //@author(nlama700) method incomplete
        }
        double display_salary(){
            return em_salary;
        }
         
         //@author(nlama700) copy constructor missing
    }
public class Lakshmisonikar {
    public static void main(String[] args) {
        Developer d1=new Developer(1,"laxmi","Tester","banking",23343.00,435, new String[]{"java", "html", "python"});
        d1.em_designation="Java 14";
        //double val = 0;
        d1.rais_salary(val);
        
        //@author(nlama700) missing operations
    }
}
