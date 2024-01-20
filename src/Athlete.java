//Kavan Kumar
//CS1
//Mr. Blick
//Contact List
// Athlete class, extending the Person class
public class Athlete extends Person
{
    // Private field to store the athlete's strength
    private int strength;

    // Constructor to initialize the Athlete object with provided values
    public Athlete(String f, String l, String p, int strength)
    {
        // Call the constructor of the superclass (Person) to initialize personal information
        super(f, l, p);

        // Set the strength specific to the Athlete class
        this.strength = strength;
    }

    // Getter method for retrieving the athlete's strength
    public int getStrength() {
        return strength;
    }

    // Setter method for updating the athlete's strength
    public void setStrength(int strength) {
        this.strength = strength;
    }

    // toString method to represent the Athlete object as a string, including personal information and strength
    public String toString()
    {
        return super.toString() + " Strength: " + strength;
    }
}
