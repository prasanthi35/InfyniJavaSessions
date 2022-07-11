

public class Employee {

    private int age; // default value = 0
    private String name; // default value = null
    private Department department; //Custom data type and  'department' is a reference variable & default value = null

    public Employee() {

    }
    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Employee(int age, String name, Department department) {
        this.age = age;
        this.name = name;
        this.department = department;
    }

    public String getName() {
    return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int ageAfter20Years() {
        int currentAge = this.getAge();
        return currentAge+20;
    }

    public Department getDepartment() {
        return department;
    }
}
