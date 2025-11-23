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

import java.util.Collection;

/**
 * The CollectionVerificationUtil class provides utility methods for checking if a collection is empty or not. Unlike the is empty method for a
 * collection, these methods handle the case if the collection is null.
 *
 * @author Chris Picard
 */
public final class CollectionVerificationUtil {

    /**
     * Default constructor made private to prevent construction since translators are static utilities.
     */
    private CollectionVerificationUtil() {
    }

    /**
     * This utility method checks if the provided collection is empty, including a check for null.
     *
     * @param collection The collection to check if it is empty.
     *
     * @return True if the collection is null or empty, false otherwise.
     */
    public static boolean isEmpty(final Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * This utility method checks if the provided collection is not empty, including a check for null.
     *
     * @param collection The collection to check if it is not empty.
     *
     * @return True if the collection is not empty, false otherwise.
     */
    public static boolean isNotEmpty(final Collection<?> collection) {
        return !isEmpty(collection);
    }
}