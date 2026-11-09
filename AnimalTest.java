//Carson Samples
//Lab Assignment 13-A
//11.9.26
//Course CMP-129-80231
public class AnimalTest 
{
    public static void main(String[] args) 
    {
        //creating dog and cat subclasses
        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");
        Dog dog2 = new Dog("Big Guy", 5, "Poodle");
        Cat cat1 = new Cat("Luna", 2, "Siamese");
        Cat cat2 = new Cat("Fat", 4, "Black");
        //dog 1 object display
        dog1.displayInfo();
        dog1.displayType();
        dog1.makeSound();
        //dog 2 object display
        dog2.displayInfo();
        dog2.displayType();
        dog2.makeSound();
        //cat 1 object display
        cat1.displayInfo();
        cat1.displayType();
        cat1.makeSound();
        //cat 2 object display
        cat2.displayInfo();
        cat2.displayType();
        cat2.makeSound();
        //getter usage
        System.out.println("Dog 1 name: " + dog1.getName()); 
        //setter usage
        dog1.setAge(4);
        dog1.setName("Brand New Dog");
        //getter usage to display the setter used a second ago
        System.out.println("Dog 1 updated name: " + dog1.getName());
        System.out.println("Updated Info for Dog 1:");
        dog1.displayInfo();
    }
}