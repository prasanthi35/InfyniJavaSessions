package inheritance.hybridInheritance;

public class Dog extends Animal{


    public void displayName() {

        System.out.println(" Animal name is ..." +getName());
    }

    public void bark() {
        System.out.println(getName() +  "makes sound as bhow bhow...");
    }
}
