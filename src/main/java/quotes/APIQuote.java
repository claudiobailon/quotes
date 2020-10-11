package quotes;


public class APIQuote extends Quote{

    String starWarsQuote;
    public APIQuote(String text){
        super(text);
    }
    public String toString() { return String.format("Star Wars Quote: %s", starWarsQuote); }

}
