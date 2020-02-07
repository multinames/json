package json.parser001.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.parser001.entity.Person;

import java.io.File;
import java.io.IOException;

public class JacksonDataBind {

    public static  void parseJson(String path){
        // Инициализация ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        Person person = null;

        try {
           person = objectMapper.readValue(new File(path), Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(person);

    }
}
