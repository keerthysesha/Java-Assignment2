import java.util.Scanner;
public class mem 
{
    public static void main(String[]args)
    {
        Scanner a=new Scanner(System.in);
        System.out.print("NAME: ");
        String name=a.nextLine();

        System.out.print("AGE: ");
        int age=a.nextInt();

        System.out.print("PHONE NUMBER: ");
        String phoneno=a.next();

        System.out.print("ADDRESS: ");
        String address=a.next();

        System.out.print("SALARY: ");
        int salary=a.nextInt();

        System.out.print("SPECIALIZATION: ");
        String spl=a.next();

        System.out.print("DEPARTMENT: ");
        String dept=a.next();

        System.out.print("POSITION: ");
        String p= a.next();
        a.close();

        if(p.equals("Employee"))
        {
            Employee e=new Employee();
            e.func(name,age,phoneno,address,spl,dept);
            e.printSalary(salary);
        }
        else if(p.equals("Manager"))
        {
            Manager m=new Manager();
            m.man(name,age,phoneno,address,spl,dept);
            m.printSalary(salary);
        }
    }
}