public class PhoneNumber {
    private String prefix;
    private String number;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneNumber(String prefix, String number){
        this.prefix = prefix;
        this.number = number;
    }

    public PhoneNumber(String s){
        String[] parts = s.split(" ");
        if (parts.length == 2) {
            prefix = parts[0];
            number = parts[1];
        } else {
            // Handle invalid email address
            throw new IllegalArgumentException("Invalid phone number format: " + s);
        }
    }
    public String getPhoneNumber(){
        return prefix+" "+number;
    }
}
