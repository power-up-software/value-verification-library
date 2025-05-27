package com.powerup.value.verification.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringVerificationUtilTest {

    @Test
    public void testIsEmptyWithNullString() {
        String nullString = null;

        boolean result = StringVerificationUtil.isEmpty(nullString);

        assertTrue(result, "A null string should be considered empty");
    }

    @Test
    public void testIsEmptyWithEmptyString() {
        String emptyString = "";

        boolean result = StringVerificationUtil.isEmpty(emptyString);

        assertTrue(result, "An empty string should be considered empty");
    }

    @Test
    public void testIsEmptyWithSpaceOnlyString() {
        String spaceOnlyString = "   ";

        boolean result = StringVerificationUtil.isEmpty(spaceOnlyString);

        assertTrue(result, "A string with only spaces should be considered empty");
    }

    @Test
    public void testIsEmptyWithTabOnlyString() {
        String tabOnlyString = "\t\t";

        boolean result = StringVerificationUtil.isEmpty(tabOnlyString);

        assertTrue(result, "A string with only tabs should be considered empty");
    }

    @Test
    public void testIsEmptyWithNewlineOnlyString() {
        String newlineOnlyString = "\n\r";

        boolean result = StringVerificationUtil.isEmpty(newlineOnlyString);

        assertTrue(result, "A string with only newlines should be considered empty");
    }

    @Test
    public void testIsEmptyWithMixedWhitespaceString() {
        String mixedWhitespaceString = " \t\n\r ";

        boolean result = StringVerificationUtil.isEmpty(mixedWhitespaceString);

        assertTrue(result, "A string with only mixed whitespace should be considered empty");
    }

    @Test
    public void testIsEmptyWithNonEmptyString() {
        String simpleString = "text";

        boolean resultSimple = StringVerificationUtil.isEmpty(simpleString);

        assertFalse(resultSimple, "A string with text should not be considered empty");
    }

    @Test
    public void testIsNotEmptyWithNullString() {
        String nullString = null;

        boolean result = StringVerificationUtil.isNotEmpty(nullString);

        assertFalse(result, "A null string should not be considered non-empty");
    }

    @Test
    public void testIsNotEmptyWithNonEmptyString() {
        String simpleString = "text";

        boolean resultSimple = StringVerificationUtil.isNotEmpty(simpleString);

        assertTrue(resultSimple, "A string with text should be considered non-empty");
    }
}