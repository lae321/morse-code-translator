package com.nology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTranslatorTest {
  @Test
  @DisplayName("Translate SOS")
  void test1() {
    MorseCodeTranslator t = new MorseCodeTranslator();
    assertEquals("sos", t.translate("... --- ..."));
  }

  @Test
  @DisplayName("Translate pangram")
  void test2() {
    MorseCodeTranslator t = new MorseCodeTranslator();
    assertEquals(
        "the quick brown fox jumped over the lazy dog",
        t.translate(
            "- .... . / --.- ..- .. -.-. -.- / -... .-. --- .-- -. / ..-. --- -..- / .--- ..- -- .--. . -.. / --- ...- . .-. / - .... . / .-.. .- --.. -.-- / -.. --- --."));
  }

  @Test
  @DisplayName("Translate Hello world")
  void test3() {
    MorseCodeTranslator t = new MorseCodeTranslator();
    assertEquals(
        "hello world",
        t.translate(".... . .-.. .-.. --- / .-- --- .-. .-.. -.."));
  }
}
