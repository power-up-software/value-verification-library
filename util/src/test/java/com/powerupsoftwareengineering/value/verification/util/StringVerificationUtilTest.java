/*
 * Copyright (c) Power Up Software Engineering LLC 2025.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package com.powerupsoftwareengineering.value.verification.util;

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