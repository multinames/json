package json.parser001_json;

import json.parser001_json.parser.JacksonDataBind;

public class Main {
    public static void main(String[] args) {
        JacksonDataBind.parseJson("src/main/resources/person.json");
    }
}
