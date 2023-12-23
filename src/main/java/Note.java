import java.util.Date;

public class Note {
    private String text;
    private Date timestamp;

    public Note(String text, Date timestamp) {
        this.text = text;
        this.timestamp = timestamp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Note{" +
                "text='" + text + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}