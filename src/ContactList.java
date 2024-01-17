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
    public void printContacts()
    {
        for(Person p: contacts)
        {
            System.out.println(p);
        }
    }
    public void sort(int sortBy) {
        for (int i = 0; i < contacts.size() - 1; i++) {
            for (int j = 0; j < contacts.size() - i - 1; j++) {
                Person person1 = contacts.get(j);
                Person person2 = contacts.get(j + 1);
                if (sortBy == 0) {
                    if (person1.getFirstName().compareTo(person2.getFirstName()) < 0) {
                        Person temp = contacts.get(j);
                        contacts.set(j, contacts.get(j + 1));
                        contacts.set(j + 1, temp);
                        printContacts();
                    }
                } else if (sortBy == 1) {
                    if (person1.getLastName().compareTo(person2.getLastName()) < 0) {
                        Person temp = contacts.get(j);
                        contacts.set(j, contacts.get(j + 1));
                        contacts.set(j + 1, temp);
                        printContacts();
                    }
                } else if (sortBy == 2) {
                    if (person1.getPhoneNumber().compareTo(person2.getPhoneNumber()) < 0) {
                        Person temp = contacts.get(j);
                        contacts.set(j, contacts.get(j + 1));
                        contacts.set(j + 1, temp);
                        printContacts();
                    }
                }
            }
        }
    }
    public Person searchByFirstName(String firstName) {
        for (Person person : contacts) {
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                return person;
            }
        }
        return null;
    }
    public Person searchByLastName(String lastName) {
        for (Person person : contacts) {
            if (person.getLastName().equalsIgnoreCase(lastName)) {
                return person;
            }
        }
        return null;
    }
    public Person searchByPhoneNumber(String phoneNumber) {
        for (Person person : contacts) {
            if (person.getPhoneNumber().equals(phoneNumber)) {
                return person;
            }
        }
        return null;
    }
    public void listStudents() {
        for (Person person : contacts) {
            if (person instanceof Student) {
                System.out.println(person);
            }
        }
    }
    public void run()
    {
        Scanner s = new Scanner(System.in);
        //fix this
        boolean t = false;
        while(t != true) {
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
            }
            if (menu == 2) {
                sort(0);
            }
            if (menu == 3) {
                sort(1);
            }
            if (menu == 4) {
                sort(2);
            }
            if (menu == 5) {
                printContacts();
            }
            if (menu == 6) {
                String firstName = s.nextLine();
                s.nextLine();
                searchByFirstName(firstName);
            }
            if (menu == 7) {
                String lastName = s.nextLine();
                searchByLastName(lastName);
            }
            if (menu == 8) {
                String phoneNumber = s.nextLine();
                s.nextLine();
                searchByPhoneNumber(phoneNumber);
            }
            if (menu == 0) {
                t = true;
            }

        }
    }
}
