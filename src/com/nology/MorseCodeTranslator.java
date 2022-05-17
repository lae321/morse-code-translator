package com.nology;

import java.util.*;
import java.util.stream.Collectors;

public class MorseCodeTranslator {

  public static String translate(String morse) {
    HashMap<String, String> morseAlphabet = new HashMap<>();
    morseAlphabet.put(".-", "a");
    morseAlphabet.put("-...", "b");
    morseAlphabet.put("-.-.", "c");
    morseAlphabet.put("-..", "d");
    morseAlphabet.put(".", "e");
    morseAlphabet.put("..-.", "f");
    morseAlphabet.put("--.", "g");
    morseAlphabet.put("....", "h");
    morseAlphabet.put("..", "i");
    morseAlphabet.put(".---", "j");
    morseAlphabet.put("-.-", "k");
    morseAlphabet.put(".-..", "l");
    morseAlphabet.put("--", "m");
    morseAlphabet.put("-.", "n");
    morseAlphabet.put("---", "o");
    morseAlphabet.put(".--.", "p");
    morseAlphabet.put("--.-", "q");
    morseAlphabet.put(".-.", "r");
    morseAlphabet.put("...", "s");
    morseAlphabet.put("-", "t");
    morseAlphabet.put("..-", "u");
    morseAlphabet.put("...-", "v");
    morseAlphabet.put(".--", "w");
    morseAlphabet.put("-..-", "x");
    morseAlphabet.put("-.--", "y");
    morseAlphabet.put("--..", "z");
    morseAlphabet.put("/", " ");

    String[] array = morse.split(" ");
    List<String> list = new ArrayList<>();

    for (String s : array) {
      list.add(morseAlphabet.get(s));
    }

    return list.stream().map(String::valueOf).collect(Collectors.joining(""));
  }
}
