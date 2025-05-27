package com.powerup.value.verification.util;

import java.util.Map;

/**
 * The MapVerificationUtil class provides utility methods for checking if a map is empty or not. Unlike the is empty method for a
 * map, these methods handle the case if the map is null.
 *
 * @author Chris Picard
 */
public final class MapVerificationUtil {

    /**
     * Default constructor made private to prevent construction since translators are static utilities.
     */
    private MapVerificationUtil() {
    }

    /**
     * This utility method checks if the provided map is empty, including a check for null.
     *
     * @param map The map to check if it is empty.
     *
     * @return True if the map is null or empty, false otherwise.
     */
    public static boolean isEmpty(final Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    /**
     * This utility method checks if the provided map is not empty, including a check for null.
     *
     * @param map The map to check if it is not empty.
     *
     * @return True if the map is not empty, false otherwise.
     */
    public static boolean isNotEmpty(final Map<?, ?> map) {
        return !isEmpty(map);
    }
}