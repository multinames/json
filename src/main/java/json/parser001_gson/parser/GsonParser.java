package json.parser001_gson.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import json.parser001_gson.entity.Currency;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class GsonParser {

    public static void parseJson(String url) throws IOException {

        // чтобы красиво отображался
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();

        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));

        Currency[] currencies =  gson.fromJson(jsonReader, Currency[].class);

        for (Currency currency : currencies) {
            System.out.println(currency);
        }
    }
}
