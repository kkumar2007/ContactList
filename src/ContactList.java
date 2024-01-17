import java.util.ArrayList;
import java.util.Scanner;
public class ContactList
{
    private ArrayList<Person> contacts;
    public ContactList()
    {
        contacts = new ArrayList<Person>();
    }
    public ArrayList<Person> getContacts()
    {
        return contacts;
    }
    public void addContact()
    {
        Scanner s = new Scanner(System.in);
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
        if(menu == 1) {
            System.out.println("Select a type of contact to add");
            System.out.println("1. Student");
            System.out.println("2. Athlete");
            int choice = s.nextInt();
            s.nextLine();
            if (choice == 1) {
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
    }
    public void printContacts()
    {

    }
}
