public class TestDAOT {
    public static void main(String[] args) {
        ContactDAOT CD = new ContactDAOT();
        Contact c1 = new Contact("matteo", "+98 6265332", "pippone@mail.com");
        CD.add(c1);
    }
}
