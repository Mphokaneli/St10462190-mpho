
public class Message {
    private String messageID;
    private int messageNumber;
    private String recipient;
    private String messageText;
    private String messageHash;
}

public Message(int messageNumber,String recipient, String messageText) {
    this.messageNumber = messageNumber;
    this.recipient = recipient;
    this.messageText = messageText;
}
public boolean checkMessageID(String id) {
return id.length() <=10;

}
public String checkRecipientCell() {
    String recipient;
    if (recipient.startsWith("=27") && recipient.length() <=12) {
        return "Cell phone number successfully captured.";
    }else {

return "Cell phone number is inncorretly formatted";
    }
}

public String checkMessageLength() {
    if(messageText.Length() <=250) {
      return "Message ready to send.";
    }else {

    int excess = messageText.length() - 250;

    return "Message exceeds 250 characters by "
            + excess;
    }

    public String generateMessageHash; (String messageld, int count, String message) {
        String[] words = message.trim().split("\\s+");
        String first = words.length >0? words[0]:"";
        String last = words.length >1? words[words.length - 1]: first;

        generateMessageHash = checkMessageID().substring (0,2) + ":" + count + ";" + first.toUpperCase()+ last.toUpperCase();
    }
    return generateMessageHash;

    public String SentMessage(int choice) {
        if(choice ==1) {
            return "Message successfully sent.";
        }else if (choice ==2){
            return "Press 0 to delete message.";
        }else if (choice ==3) {
    }
        return "Invalid option.";

        public String printMessage() {

            return "Message ID: " + messageID + "\nHash:" + messageHash + "\nRecipient: " + recipient + "\nMessage: " + messageText;
        }

        public int returnTotalMessage() {
            return messageNumber
        }