package quotes;

public class Quote {
    String author;
    String text;

    public Quote(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String toString(){
        return String.format("Quote: %s \n- %s",text,author);
    }
}
