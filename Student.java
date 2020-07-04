
public class Student extends Person {
    
    double cgpa ;
    public Student(String name , String ic , double cgpa ){
        super(name,ic);
        this.cgpa = cgpa;
    }
    
 
    public double getCgpa() {return cgpa ;}
    
    public void info() {
        System.out.print("\n"+name + ", " + ic + " is a : Student");
    }
    
}