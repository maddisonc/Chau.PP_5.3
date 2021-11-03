public class DogDriver
{
    public static void main (String[] args)
    {
        // dog1: Fang - a 5 year old Husky that weighs 80 pounds
        Dog dog1 = new Dog ("Fang", 5, "Husky", 80);
        // System.out.println(dog1.toString());

        // dog2: Piper - a 3 year old Australian Shepherd that is 45 pounds
        Dog dog2 = new Dog ("Piper", 3, "Australian Shepherd", 45);
        // System.out.println("\n"+ dog2.toString());

        // dog3: Bagel - a 4 year old Pug that is 25 pounds
        Dog dog3 = new Dog ("Bagel", 4, "Pug", 25);
        // System.out.println("\n"+ dog3.toString());

        // OUTPUT: Fang’s breed and age, Piper's weight, your dog’s full description and how many dogs you have.
        System.out.println("Fang’s breed: " + dog1.getBreed());
        System.out.println("Fang’s age in years: " + dog1.getAge());
        System.out.println("Piper's weight in pounds: " + dog2.getWeight());
        System.out.println("Piper's weight in kilograms: " + dog2.poundsToKilos());
        System.out.println("\n" + dog3.toString());
        System.out.println("\nNumber of dogs: " + Dog.dogCount);

        // Compare Piper's age to Fang's age
        if (dog2.compareTo(dog1) == 0)
        {
            System.out.println("Piper is the same age as Fang.");
        }
        if (dog2.compareTo(dog1) > 0)
        {
            System.out.println("Piper is older than Fang.");
        }
        if (dog2.compareTo(dog1) < 0)
        {
            System.out.println("Piper is younger than Fang.");
        }

        // Compare Fang's age to Bagel's age
        if (dog1.compareTo(dog3) == 0)
        {
            System.out.println("Fang is the same age as Bagel.");
        }
        if (dog1.compareTo(dog3) > 0)
        {
            System.out.println("Fang is older than Bagel.");
        }
        if (dog1.compareTo(dog3) < 0)
        {
            System.out.println("Fang is younger than Bagel.");
        }

    } // end main method
} // end DogDriver class
