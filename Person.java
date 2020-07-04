

public abstract class Person{
    protected String name;
    protected String ic ;
    protected double salary;
    protected double cgpa ;
    
    public Person(String name , String ic ){
        this.name = name ;
        this.ic = ic ;
    }
    
    public double getSalary() {return salary ;}
    public double getCgpa() {return cgpa ;}
    
    public abstract void info() ;
    
}