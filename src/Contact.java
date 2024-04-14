public class Contact {
    private String name;
    private String number;
    private String mail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * The constructor of Contact
     * @param name the name of the contact
     * @param number the telephone number
     * @param mail the mail
     */
    public Contact(String name, String number, String mail) {
        this.name = name;
        this.number = number;
        this.mail = mail;
    }

    public void printInfo() {
        System.out.println(name + " -- >  " + number + "  mail: " + mail);
    }


    public String allString() {
        return number+";"+name+";"+mail+"\n";
    }
}
