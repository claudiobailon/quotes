package quotes;


public class APIQuote extends Quote{

    String apiQuote;
    String quoteAuthor;
    String quoteText;


    public APIQuote(String author, String text){
        super(author, text);
    }

//    public void normalizeQuote(){
//        this.text = this.apiQuote.split("\\s-\\s")[0].toString();
//        this.author = this.apiQuote.split("\\s-\\s")[1].toString();
//    }
public String toString() {
    return String.format("API Quote: %s \n - %s", this.quoteText, this.quoteAuthor);
}

}
