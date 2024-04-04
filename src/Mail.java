public class Mail {
    private String username;
    private String domain;

    public String getUsername(){
        return username;
    }
    public String getDomain() {
        return domain;
    }

    public String getMail(){
        return username+"@"+domain;
    }
    public Mail(String s){
        String[] parts = s.split("@");
        if (parts.length == 2) {
            username = parts[0];
            domain = parts[1];
        } else {
            // Handle invalid email address
            throw new IllegalArgumentException("Invalid email address format: " + s);
        }
    }
}
