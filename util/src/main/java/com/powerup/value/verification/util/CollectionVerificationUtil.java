package com.powerup.value.verification.util;

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