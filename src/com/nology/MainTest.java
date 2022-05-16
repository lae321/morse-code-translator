package com.nology;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @Test
  @DisplayName("Stuff")
  void translate() {
    assertEquals("sos", MorseCodeTranslator.translate("... --- ..."));
  }

  @Test
  @DisplayName("Translate SOS")
  void translate() {
    assertEquals("sos", MorseCodeTranslator.translate("... --- ..."));
  }

  @Test
  @DisplayName("Translate pangram")
  void translate() {
    assertEquals(
        "the quick brown fox jumped over the lazy dog",
        MorseCodeTranslator.translate(
            "- .... . / --.- ..- .. -.-. -.- / -... .-. --- .-- -. / ..-. --- -..- / .--- ..- -- .--. . -.. / --- ...- . .-. / - .... . / .-.. .- --.. -.-- / -.. --- --.\n"
                + "\n"));
  }

  @Test
  @DisplayName("Translate Hello world")
  void translate() {
    assertEquals(
        "hello world",
        MorseCodeTranslator.translate(".... . .-.. .-.. --- / .-- --- .-. .-.. -..\n" + "\n"));
  }
}
