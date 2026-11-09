//Carson Samples
//Lab Assignment 13-A
//11.9.26
//Course CMP-129-80231
public abstract class Animal 
{
    //initialize private variables
    private String name;
    private int age;
    private String species;
    //paramterized constructor
    public Animal(String name, int age, String species) 
    {
        this.name = name;
        this.age = age;
        this.species = species;
    }
    //getters and setters
    public String getName() 
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) 
    {
        this.age = age;
    }
    public String getSpecies() 
    {
        return species;
    }
    public void setSpecies(String species) 
    {
        this.species = species;
    }
    public void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + species);
    }
    public abstract void makeSound();
}