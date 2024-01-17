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

    }
}
