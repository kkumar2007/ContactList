// Student class, extending the Person class
//Kavan Kumar
//CS1
//Mr. Blick
//Contact List
public class Student extends Person
{
    // Private field to store the student's grade
    private int grade;

    // Constructor to initialize the Student object with provided values
    public Student(String f, String l, String p, int grade)
    {
        // Call the constructor of the superclass (Person) to initialize personal information
        super(f, l, p);

        // Set the grade specific to the Student class
        this.grade = grade;
    }

    // Getter method for retrieving the student's grade
    public int getGrade() {
        return grade;
    }

    // Setter method for updating the student's grade
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // toString method to represent the Student object as a string, including personal information and grade
    public String toString()
    {
        return super.toString() + " Grade: " + grade;
    }
}
