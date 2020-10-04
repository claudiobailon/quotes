package quotes;


public class APIQuote extends Quote{

    String apiQuote;

    public APIQuote(String author, String quote){
        super(author, quote);
    }

    public void normalizeQuote(){
        this.text = this.apiQuote.split("\\s—\\s")[0].toString();
        this.author = this.apiQuote.split("\\s—\\s")[1].toString();
    }
}
