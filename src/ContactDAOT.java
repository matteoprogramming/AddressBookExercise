import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ContactDAOT {
    public final String filename = "contacts.txt";
    public List<Contact> listContact() {
        List<Contact> contacts = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                contacts.add(new Contact(parts[0],parts[1], parts[2]));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    public void add(Contact contact) {

        try {
            FileWriter writer = new FileWriter(filename, true); // append : true
            writer.write(contact.allString());
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
