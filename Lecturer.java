public class Lecturer extends Person {
    
    double salary ;
    public Lecturer(String name , String ic , double salary ){
        super(name,ic);
        this.salary = salary;
    }
    
    
    public double getSalary() {return salary;}
    
    public void info() {
        System.out.print("\n" + name + ", " + ic + " is a : Lecturer");
    }
    
}