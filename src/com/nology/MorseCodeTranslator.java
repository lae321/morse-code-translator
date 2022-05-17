package com.nology;

import java.util.*;

public class MorseCodeTranslator {

  public MorseCodeTranslator() {}

  public void morseMap() {



  }

  public int translate(String morse) {

    HashMap<String, String> morseAlphabet = new HashMap<>();
    morseAlphabet.put("a", ".-");
    morseAlphabet.put("b", "-...");
    morseAlphabet.put("c", "-.-.");
    morseAlphabet.put("d", "-..");
    morseAlphabet.put("e", ".");
    morseAlphabet.put("f", "..-.");
    morseAlphabet.put("g", "--.");
    morseAlphabet.put("h", "....");
    morseAlphabet.put("i", "..");
    morseAlphabet.put("j", ".---");
    morseAlphabet.put("k", "-.-");
    morseAlphabet.put("l", ".-..");
    morseAlphabet.put("m", "--");
    morseAlphabet.put("n", "-.");
    morseAlphabet.put("o", "---");
    morseAlphabet.put("p", ".--.");
    morseAlphabet.put("q", "--.-");
    morseAlphabet.put("r", ".-.");
    morseAlphabet.put("s", "...");
    morseAlphabet.put("t", "-");
    morseAlphabet.put("u", "..-");
    morseAlphabet.put("v", "...-");
    morseAlphabet.put("w", ".--");
    morseAlphabet.put("x", "-..-");
    morseAlphabet.put("y", "-.--");
    morseAlphabet.put("z", "--..");

    String[] wordArr = morse.split(" / ");
    System.out.println("Sentence array" + Arrays.toString(wordArr));

    List<String> wordList = Arrays.asList(wordArr);
    System.out.println(wordList);

    List<String> letterList = new ArrayList<>();



//    for (String letter : letterList) {
//
//    }
    
//    for (String letter : letterList) {
//      System.out.println(letter);
//    }

//    String[][] letterArr = new String[wordArr.length][];
//    for (int i = 0; i < wordArr.length; i++) {
//      String word = wordArr[i];
//
//      String[] letters = word.split(" ");
//      for (String letter : letters) {
//          letter = letter.replace(" ", "");
//      }
//
//      letterArr[i] = letters;
//    }
//
//    for (String[] thing : letterArr) {
//      System.out.println(Arrays.toString(thing));
//    }
//
////    for (int i = 0; i < letterArr.length; i++) {
////      for (int j = 0; j < letterArr[i].length(); j++) {
////        System.out.println(letterArr[j]);
//////        for (Map.Entry entry : morseAlphabet.entrySet() ) {
//////            if (letterArr[i][j].equals)
//////        }
//////      }
////    }

    return 0;
  }
}
