import java.util.Scanner;

public class PersonApp
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Person [] person = new Person[3];
        
        // Assume we have input all 42 entry consist of Lecturer, student, academic and library staff
        
        // create an array of length 10. NOT creating object here .
       char answer ;
       int index = 0;
       do {
        
           System.out.println("1.Student\n2.Lecturer");
           System.out.print("Your Selection : ");
           int sel = in.nextInt();
           in.nextLine();
           
           if(sel==1) {
               
               System.out.print("Enter name: ");
               String name = in.nextLine();
               System.out.print("Enter ic : ");
               String ic = in.nextLine();
               System.out.print("Enter CGPA : ");
               double cgpa = in.nextDouble();
               person[index] = new Student(name,ic,cgpa);
               
            } else if(sel == 2 ) {
               System.out.print("Enter name: ");
               String name = in.nextLine();
               System.out.print("Enter ic : ");
               String ic = in.nextLine();
               System.out.print("Enter Salary");
               double salary = in.nextDouble();
               person[index] = new Lecturer(name,ic,salary);
            } else {
                System.out.println("Wrong input ! ");
            }
           
           
           index++;
           System.out.print("Press Y to continue: ");
           answer = in.next().charAt(0);   
        }while(Character.toUpperCase(answer) == 'Y');
        
      
        for(int i=0;i<person.length;i++) {
            person[i].info();
        }
        
        
        //Question: Find lecturer that salary is above 5000
        int salaryAbove5k = 0;
        for(int i=0; i<person.length; i++)
        {
            if(person[i] instanceof Lecturer)
            {
                
                if(person[i].getSalary() > 5000)
                {
                    salaryAbove5k++;
                }
            }
        }
        
        System.out.println("\n\nLecturer above 5k salary: " + salaryAbove5k);
        
        int pointerAbove3_5 = 0;
        for(int i=0; i<person.length; i++)
        {
            if(person[i] instanceof Student)
            {
                if(person[i].getCgpa() > 3.5)
                {
                    pointerAbove3_5++;
                }
            }
        }
        
        System.out.println("\nStudent pointer above 3.5: " + pointerAbove3_5);
        
        
        
    }
}