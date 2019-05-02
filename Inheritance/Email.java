public class Email extends Document{
    private String sender;
    private String recipient;
    private String subject;
    //Constructor that assigns values to the fields that are sent in
    public Email(String sender, String recipient, String subject, String text){
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
        text = text;
    }
    //Constructor that sets text to default
    public Email(String sender, String recipient, String subject){
        super();
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
    }
    
}