package json.parser001;

import json.parser001.parser.JacksonDataBind;

public class Main {
    public static void main(String[] args) {
        JacksonDataBind.parseJson("src/main/resources/person.json");
    }
}
