package quotes;

public class Quote {
    String author;
    String text;

    public Quote(String author, String quote) {
        this.author = author;
        this.text = quote;
    }

    public String toString(){
        return String.format("Quote: %s \n- %s",text,author);
    }
}
