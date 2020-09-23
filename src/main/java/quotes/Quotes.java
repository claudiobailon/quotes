package quotes;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quotes {

    public static void pullGson () throws FileNotFoundException {

        Gson gson = new Gson();
        Scanner quoteScanner = new Scanner(new File("src/main/resources/quotes.json"));

        Quotes quote = gson.fromJson(quotes,Quotes.class);
    }
}
