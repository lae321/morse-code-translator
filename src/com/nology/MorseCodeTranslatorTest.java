package com.nology;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTranslatorTest {
  @Test
  @DisplayName("Translate SOS")
  void test1() {
    assertEquals("sos", MorseCodeTranslator.translate("... --- ..."));
  }

  @Test
  @DisplayName("Translate pangram")
  void test2() {
    assertEquals(
        "the quick brown fox jumped over the lazy dog",
        MorseCodeTranslator.translate(
            "- .... . / --.- ..- .. -.-. -.- / -... .-. --- .-- -. / ..-. --- -..- / .--- ..- -- .--. . -.. / --- ...- . .-. / - .... . / .-.. .- --.. -.-- / -.. --- --."));
  }

  @Test
  @DisplayName("Translate Hello world")
  void test3() {
    assertEquals(
        "hello world",
        MorseCodeTranslator.translate(".... . .-.. .-.. --- / .-- --- .-. .-.. -.."));
  }
}
