package com.example.demo.controller;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
public class GeneratorWords {
    public String GenerateWord() {
        String localWord = null;
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Котлету", "BMW", "IPhone", "Биткоин", "Гучи", "Сайт"));
        int randomNum = ThreadLocalRandom.current().nextInt(0, 6);

        return words.get(randomNum);
    }
}
