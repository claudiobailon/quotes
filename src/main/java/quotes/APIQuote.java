package quotes;


public class APIQuote extends Quote{

    String apiQuote;

    public APIQuote(String author, String quote, String apiQuote){
        super(author, quote);
        this.apiQuote = apiQuote;
    }

    public String toString(){
        return String.format("Quote: %s", apiQuote);
    }
}
