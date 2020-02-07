package json.parser001_gson;

import json.parser001_gson.parser.GsonParser;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        GsonParser.parseJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }

}
