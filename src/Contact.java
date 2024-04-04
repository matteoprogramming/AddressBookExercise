public class Contact {
    private String name;
    private PhoneNumber number;
    private Mail mail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneNumber getNumber() {
        return number;
    }

    public void setNumber(PhoneNumber number) {
        this.number = number;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    public Contact(String name, PhoneNumber number, Mail mail) {
        this.name = name;
        this.number = number;
        this.mail = mail;
    }

    public void printInfo() {
        System.out.println(name + " -- >  " + number.getPhoneNumber() + "  mail: " + mail.getMail());
    }

}
