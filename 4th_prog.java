public class Driver{
    public static void main(String args[])
    {
	 //creating instances for class Student
        Student S1 = new Student("Ram", 1, 56.38, new String[]{"java", "html", "python"});
        Student S2 = new Student("Shyam", 2, 89.45, new String[]{"angular", "css", "nodejs"});
        Student S3 = new Student("Virat", 3, 76.89, new String[]{"flask", "html", "python"});
        Student S4 = new Student("Sourav", 4, 68.34, new String[]{"c++", "java", "python"});
        Student S5 = new Student("Gopal", 5, 85.49, new String[]{"java", "c++", "python"});
        S2.setName("XYZ"); //setting the name 'XYZ'
        S1.update_skills("angular"); //updating the skill
        S2.showAttributes(); //shows all properties/attributes
        S4.showNAME(); //shows name in uppercase
        S5.showDifference(S3); //comparing percentage
    }
}
