import javax.xml.soap.SOAPPart;

public class TestApplication {

    public static void main(String[] args) {

        // declaring an object of a class
        // Right side code with 'new' - keyword is declaring an Object
        //<Class Name> <reference variable> = new <Class Name()>;
        Employee emp = new Employee();

        emp.setAge(15);
        int age = emp.getAge();
        System.out.println("Printing age:  "   +age);
        int ageAfter20YearsPrint = emp.ageAfter20Years();
        System.out.println("Printing  current age:  "   +ageAfter20YearsPrint);
        System.out.println("Printing name: " +emp.getName()); // output is: Null

        Employee emp1 = new Employee(50, " Naga");

        int age1 = emp1.getAge();
        String name1 = emp1.getName();
        System.out.println("Printing age:  "   +age1);
        int ageAfter20YearsPrint1 = emp1.ageAfter20Years();
        System.out.println("Printing  current age:  "   +ageAfter20YearsPrint1);
        System.out.println("Printing name: " +emp1.getName()); // output is: Naga
        System.out.println("Printing name: " +name1); // output is: Naga
        System.out.println(" Printing department without setting department: " +emp1.getDepartment());

        Department department = new Department();
        Department department2 = new Department(1, "Software");

        Employee emp3 = new Employee(50, " Naga",department2);
        System.out.println(" Printing department ID: " +emp3.getDepartment().getDeptID());
        System.out.println(" Printing department Name: " +emp3.getDepartment().getDepartmentName());

    }
}
