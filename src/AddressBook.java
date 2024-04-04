import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<Contact> contacts;
    private Contact myPhone;

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Contact getMyPhone() {
        return myPhone;
    }

    public void setMyPhone(Contact myPhone) {
        this.myPhone = myPhone;
    }

    public AddressBook(){
        contacts = new ArrayList<Contact>();
    }

    /**
     * Add a new contact to the contacts list.
     */
    public void addNewContact() {
        System.out.println();
        System.out.println("--- Adding new contact ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact name> ");
        String name = scanner.nextLine();
        System.out.print("Enter contact phone number (with prefix) [eg: +39 3434234309]> ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter contact email> ");
        String email = scanner.nextLine();
        System.out.println();

        Contact newContact = new Contact(name, new PhoneNumber(phoneNumber), new Mail(email));
        contacts.add(newContact);
        System.out.println("Contact added successfully!");
        System.out.println("---------------------------");
    }

    public void printAllContacts(){
        System.out.println("--- All contacts ---");
        int i = 0;
        for (Contact contact : contacts){
            System.out.print(i + ")  ");
            contact.printInfo();
            i++;
        }
        System.out.println("------------------");
        System.out.println();;
    }

    public void getNumberFromName(){
        System.out.println("--- Get info from the name ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact name> ");
        String name = scanner.nextLine();
        System.out.println();
        for (Contact contact : contacts){
            if (contact.getName().contains(name)){
                contact.printInfo();
            }
        }
        System.out.println("--------------------");
        System.out.println();
    }

    /**
     * The main function from which the application starts.
     */
    public void run() {
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("AddressBook APPLICATION");
        System.out.println("-----------------------");
        int chose;
        var sc = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("OPTIONS:");
            System.out.println("1  - Add a contact");
            System.out.println("2  - Print all contacts");
            System.out.println("3  - Search name");
            System.out.print("Choose the desired option: (0 to exit)> ");
            chose = sc.nextInt();
            System.out.println();
            switch (chose){
                case 0 -> System.out.println("Exiting...");
                case 1 -> addNewContact();
                case 2 -> printAllContacts();
                case 3 -> getNumberFromName();
                default -> System.out.println("Error... INVALID INPUT");
            }
        } while (chose != 0);
    }

}

