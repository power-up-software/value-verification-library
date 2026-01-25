/*
 * Copyright (c) Power Up Software Engineering LLC 2026.
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

/**
 * The StringVerificationUtil class provides utility methods for checking if a string is empty or not. Unlike the is empty method for a
 * string, these methods handle the case if the string is null. It also considers string that only containing whitespace as empty.
 *
 * @author Chris Picard
 */
public final class StringVerificationUtil {
    /**
     * Default constructor made private to prevent construction since translators are static utilities.
     */
    private StringVerificationUtil() {
    }

    /**
     * This utility method checks if the provided String is empty, including a check for null and if it only contains whitespace.
     *
     * @param stringValue The string to check if it is empty.
     *
     * @return True if the string is null, only whitespace, or empty, false otherwise.
     */
    public static boolean isEmpty(final String stringValue) {
        boolean isEmpty;
        if (stringValue == null || stringValue.isEmpty()) {
            isEmpty = true;
        } else {
            isEmpty = true;
            for (int i = 0; i < stringValue.length(); i++) {
                if (!Character.isWhitespace(stringValue.charAt(i))) {
                    isEmpty = false;
                    break;
                }
            }
        }
        return isEmpty;
    }

    /**
     * This utility method checks if the provided String is not empty, including a check for null and if it contains whitespace more than just
     * whitespace.
     *
     * @param stringValue The string to check if it is not empty.
     *
     * @return True if the string contains a non-whitespace value, false otherwise.
     */
    public static boolean isNotEmpty(final String stringValue) {
        return !isEmpty(stringValue);
    }
}