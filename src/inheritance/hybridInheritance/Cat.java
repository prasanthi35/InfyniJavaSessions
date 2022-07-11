package inheritance.hybridInheritance;

public class Cat extends Animal{

    public void displayName() {
        System.out.println(" Animal name is ..." +getName());
    }

    public void animalSound() {
        System.out.println(getName()  + "makes sound as meoww...");
    }

}
