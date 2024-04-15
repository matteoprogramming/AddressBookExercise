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
                if (line.charAt(0) != '#') {
                    String[] parts = line.split(";");
                    contacts.add(new Contact(parts[0], parts[1], parts[2]));
                }
            }
            reader.close();

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

    public void remove(Contact c) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            BufferedWriter writer = new BufferedWriter(new FileWriter("temp.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String name = parts[0].trim();
                String number = parts[1].trim();
                String mail = parts[2].trim();
                if (!name.equals(c.getName()) || !number.equals(c.getNumber()) || !mail.equals(c.getMail())) {
                    writer.write(line + "\n");
                } else {
                    writer.write("#" + line + "\n");
                }
            }

            reader.close();
            writer.close();

            File oldFile = new File(filename);
            File newFile = new File("temp.txt");

            oldFile.delete();
            newFile.renameTo(oldFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
