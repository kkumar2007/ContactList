//Kavan Kumar
//CS1
//Mr. Blick
//Contact List
public class Person
{
    // Private fields to store personal information
    private String firstName;
    private String lastName;
    private String phoneNumber;

    // Constructor to initialize the Person object with provided values
    public Person(String f, String l, String p)
    {
        firstName = f;
        lastName = l;
        phoneNumber = p;
    }

    // Getter method for retrieving the first name
    public String getFirstName() {
        return firstName;
    }

    // Setter method for updating the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter method for retrieving the last name
    public String getLastName() {
        return lastName;
    }

    // Setter method for updating the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter method for retrieving the phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter method for updating the phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // toString method to represent the object as a string
    public String toString()
    {
        return firstName + " " + lastName + " - #" + phoneNumber;
    }
}
