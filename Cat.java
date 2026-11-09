//Carson Samples
//Lab Assignment 13-A
//11.9.26
//Course CMP-129-80231
public class Cat extends Animal 
{
    //paramterized constructor with super
    public Cat(String name, int age, String species) 
    {
        super(name, age, species);
    }
    //override usage and makeasound function to be used by animal
    @Override
    public void makeSound() 
    {
        System.out.println("Sound: Meow!");
    }
    //display animal type function
    public void displayType() 
    {
        System.out.println("Animal type: Cat");
    }
}