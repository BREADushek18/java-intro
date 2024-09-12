package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class backwardWordsTest {

    @Test
    public void testBackwardWord() {
        assertEquals("llatsni ekam", backwardWords.backwardWord("make install"));
        assertEquals("tset", backwardWords.backwardWord("test"));
        assertEquals("a", backwardWords.backwardWord("a"));
        assertEquals("", backwardWords.backwardWord(""));
        assertEquals("!dlroW ,olleH", backwardWords.backwardWord("Hello, World!"));
    }
}
