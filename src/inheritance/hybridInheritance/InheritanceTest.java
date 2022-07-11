package inheritance.hybridInheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("piku dog");
        dog.displayName();
        dog.eat();
        dog.setNoOfHearts(1);
        dog.displayHearts();

        System.out.println("*************************************");

        Cat cat = new Cat();
        cat.setName("Misi cat");
        cat.displayName();
        cat.eat();
        cat.setNoOfHearts(2);
        cat.displayHearts();

        System.out.println("*************************************");

        Octopus octopus = new Octopus();
        octopus.setName("Octa octopus");
        octopus.displayName();
        octopus.eat();
        octopus.setNoOfHearts(4);
        octopus.displayHearts();






         }
}
