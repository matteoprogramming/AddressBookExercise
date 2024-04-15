public class TestDAOT {
    public static void main(String[] args) {
        ContactDAOT CD = new ContactDAOT();
        Contact c1 = new Contact("matteo", "+98scemochilegge", "matteo@gmail.com");
        CD.add(c1);
        CD.remove(c1);
    }
}
