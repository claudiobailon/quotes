package quotes;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quotes {
    String author;
    String text;

    public Quotes(String author, String quote) {
        this.author = author;
        this.text = quote;
    }

    public String toString(){
        return String.format("Quote: %s - \n%s",text,author);
    }


//    public static void pullGson () {


//    }
}
