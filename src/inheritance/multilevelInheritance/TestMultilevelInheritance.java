package inheritance.multilevelInheritance;

public class TestMultilevelInheritance {

    public static void main(String[] args) {

        Father father = new Father();
        father.nameOfMethod1();
        father.nameOfMethod2();

        System.out.println(" Displaying methods of child class...");
        Child child = new Child();
        child.nameOfMethod3();
        child.nameOfMethod1();
        child.nameOfMethod2();

    }
}
