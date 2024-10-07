package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @BeforeEach
    void initialize() {
    }

    @AfterEach
    void cleanup() {
    }

    @Test
    void testNullRomanNumeral() {
        assertFalse(ArabicConverter.validateRoman(null));
    }

    @Test
    void testEmptyRomanNumeral() {
        assertFalse(ArabicConverter.validateRoman(""));
    }

    @Test
    void testRomanNumeralWithArabicDigits() {
        assertFalse(ArabicConverter.validateRoman("XIV123"));
    }

    @Test
    void testRomanNumeralWithInvalidCharacters() {
        assertFalse(ArabicConverter.validateRoman("XIV%M"));
    }

    @Test
    void testRomanNumeralWithCyrillicLetters() {
        assertFalse(ArabicConverter.validateRoman("ХІСМ"));
    }

    @Test
    void testLowerCaseRomanNumeral() {
        assertFalse(ArabicConverter.validateRoman("xiv"));
    }

    @Test
    void testRomanNumeralWithNonRomanCharacters() {
        assertFalse(ArabicConverter.validateRoman("XIV;LM"));
    }

    @Test
    void testRomanNumeralWithInvalidSequences() {
        assertFalse(ArabicConverter.validateRoman("IIXII"));
    }

    @Test
    void testValidRomanNumeral() {
        assertTrue(ArabicConverter.validateRoman("XIV"));
    }

    @Test
    void testValidLargeRomanNumeral() {
        assertTrue(ArabicConverter.validateRoman("MCMXCIV")); // 1994
    }
}