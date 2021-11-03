import java.text.DecimalFormat;

public class Dog implements Comparable
{
    // Instance Variables
    private String name;
    private int age;
    private String breed;
    private double weight; // weight in pounds

    public static int dogCount; // static variable to count all dogs

    // Constructors
    public Dog (String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        dogCount++;
    } // end full constructor

    public Dog ()
    {
        this.name = "Unnamed dog";
        this.age = 0;
        this.breed = "Unknown breed";
        this.weight = 0;
        dogCount++;
    } // end default constructor (blank)

    // Getters
    public String getName ()
    {
        return name;
    }
    public int getAge ()
    {
        return age;
    }
    public String getBreed ()
    {
        return breed;
    }
    public double getWeight ()
    {
        return weight;
    }

    // Setters
    public void setName (String name)
    {
        this.name = name;
    }
    public void setAge (int age)
    {
        this.age = age;
    }
    public void setBreed (String breed)
    {
        this.breed = breed;
    }
    public void setWeight (double weight)
    {
        this.weight = weight;
    }

    // Brain
    public String poundsToKilos ()
    {
        DecimalFormat kilosFormat = new DecimalFormat("0.##");
        String kilosStr;
        double kilos = 0.453592 * weight;
        kilosStr = "This dog weighs " + kilosFormat.format(kilos) + " kilograms.";
        return kilosStr;
    } // end poundsToKilos - converts dog's weight in lb to kg

    // toString()
    public String toString ()
    {
        String output = "Dog's name: " + name;
        output += "\nDog's age in years: " + age;
        output += "\nDog breed: " + breed;
        output += "\nDog's weight in pounds: " + weight;
        return output;
    } // end toString

    // compareTo
    @Override
    public int compareTo(Object dogObj) {
        int output = 0;
        if (this.age < ((Dog)dogObj).getAge())
        {
            output = -1;
        }
        else if (this.age > ((Dog)dogObj).getAge())
        {
            output = 1;
        }
        return output;
    } // end compareTo

} // end dogClass