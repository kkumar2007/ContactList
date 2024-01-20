//Kavan Kumar
//CS1
//Mr. Blick
//Contact List
import java.util.ArrayList;
import java.util.Scanner;

// ContactList class for managing a list of Person objects
public class ContactList
{
    // Private ArrayList to store Person objects
    private ArrayList<Person> contacts;

    // Constructor to initialize the ContactList with an empty ArrayList
    public ContactList()
    {
        contacts = new ArrayList<Person>();
    }

    // Getter method to retrieve the list of contacts
    public ArrayList<Person> getContacts()
    {
        return contacts;
    }

    // Method to add a new contact to the list based on user input
    public void addContact()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Select a type of contact to add");
        System.out.println("1. Student");
        System.out.println("2. Athlete");
        int choice = s.nextInt();
        s.nextLine();
        if (choice == 1) {
            // Adding a Student contact
            System.out.println("Please fill in the following information");
            System.out.println("First Name: ");
            String name = s.nextLine();
            System.out.println("Last Name: ");
            String last = s.nextLine();
            System.out.println("Phone Number: ");
            String phone = s.nextLine();
            System.out.println("Grade: ");
            int grade = s.nextInt();
            s.nextLine();
            Person newer = new Student(name, last, phone, grade);
            contacts.add(newer);
        } else if (choice == 2) {
            // Adding an Athlete contact
            System.out.println("Please fill in the following information");
            System.out.println("First Name: ");
            String name1 = s.nextLine();
            System.out.println("Last Name: ");
            String last1 = s.nextLine();
            System.out.println("Phone Number: ");
            String phone1 = s.nextLine();
            System.out.println("Power: ");
            int power = s.nextInt();
            s.nextLine();
            Person newer1 = new Athlete(name1, last1, phone1, power);
            contacts.add(newer1);
        }
    }

    // Method to print all contacts in the list
    public void printContacts()
    {
        for (Person p : contacts)
        {
            System.out.println(p);
        }
    }

    // Method to sort contacts based on the specified criteria
    public void sort(int sortBy) {
        int comparisonResult = 0;
        for (int i = 0; i < contacts.size() - 1; i++) {
            for (int j = 0; j < contacts.size() - i - 1; j++) {
                Person person1 = contacts.get(j);
                Person person2 = contacts.get(j + 1);
                if (sortBy == 0) {
                    comparisonResult = person1.getFirstName().compareTo(person2.getFirstName());
                } else if (sortBy == 1) {
                    comparisonResult = person1.getLastName().compareTo(person2.getLastName());
                } else if (sortBy == 2) {
                    comparisonResult = person1.getPhoneNumber().compareTo(person2.getPhoneNumber());
                }

                if (comparisonResult > 0) {
                    // Swap
                    Person temp = contacts.get(j);
                    contacts.set(j, contacts.get(j + 1));
                    contacts.set(j + 1, temp);
                }
            }
        }
        printContacts();
    }

    // Method to search for a contact by first name
    public Person searchByFirstName(String firstName) {
        for (Person person : contacts) {
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                return person;
            }
        }
        return null;
    }

    // Method to search for a contact by last name
    public Person searchByLastName(String lastName) {
        for (Person person : contacts) {
            if (person.getLastName().equalsIgnoreCase(lastName)) {
                return person;
            }
        }
        return null;
    }

    // Method to search for a contact by phone number
    public Person searchByPhoneNumber(String phoneNumber) {
        for (Person person : contacts) {
            if (person.getPhoneNumber().equals(phoneNumber)) {
                return person;
            }
        }
        return null;
    }

    // Method to list all students in the contact list
    public void listStudents() {
        for (Person person : contacts) {
            if (person instanceof Student) {
                System.out.println(person);
            }
        }
    }

    // Method to run the main functionality of the ContactList
    public void run() {
        Scanner s = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Welcome to your Contacts List");
        System.out.println("Please pick from the following menu options");
        System.out.println("");
        while (!exit) {
            System.out.println("Menu");
            System.out.println("1. Add Contact");
            System.out.println("2. List All Contacts by First Name");
            System.out.println("3. List All Contacts by Last Name");
            System.out.println("4. List All Contacts by Phone Number");
            System.out.println("5. List All Students");
            System.out.println("6. Search by First Name");
            System.out.println("7. Search by Last Name");
            System.out.println("8. Search by Phone Number");
            System.out.println("0. Exit");
            int menu = s.nextInt();
            s.nextLine();
            if (menu == 1) {
                addContact();
            } else if (menu == 2) {
                sort(0);
            } else if (menu == 3) {
                sort(1);
            } else if (menu == 4) {
                sort(2);
            } else if (menu == 5) {
                printContacts();
            } else if (menu == 6) {
                System.out.println("Enter First Name to search:");
                String firstName = s.nextLine();
                Person result1 = searchByFirstName(firstName);
                if (result1 != null) {
                    System.out.println(result1);
                } else {
                    System.out.println(firstName + "is not in the list");
                }
            } else if (menu == 7) {
                System.out.println("Enter Last Name to search:");
                String lastName = s.nextLine();
                Person result2 = searchByLastName(lastName);
                if (result2 != null) {
                    System.out.println(result2);
                } else {
                    System.out.println(lastName + "is not in the list");
                }
            } else if (menu == 8) {
                System.out.println("Enter Phone Number to search:");
                String phoneNumber = s.nextLine();
                Person result3 = searchByPhoneNumber(phoneNumber);
                if (result3 != null) {
                    System.out.println(result3);
                } else {
                    System.out.println(phoneNumber + "is not in the list");
                }
            } else if (menu == 0) {
                exit = true;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Main method for testing the ContactList class
    public static void main(String[] args) {
        // Creating instances of Person, Student, and ContactList
        Person p = new Person("Kavan", "Kumar", "9294180042");
        Student s = new Student("Kairav", "Kumar", "2039979276", 7);
        ContactList contact = new ContactList();
        contact.run(); // Running the ContactList functionality
    }
}
