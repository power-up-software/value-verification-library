package com.powerup.value.verification.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionVerificationUtilTest {

    @Test
    public void testIsEmptyWithNullCollection() {
        Collection<?> nullCollection = null;

        boolean result = CollectionVerificationUtil.isEmpty(nullCollection);

        assertTrue(result, "A null collection should be considered empty");
    }

    @Test
    public void testIsEmptyWithEmptyCollection() {
        Collection<Object> emptyCollection = Collections.emptyList();

        boolean resultCollection = CollectionVerificationUtil.isEmpty(emptyCollection);

        assertTrue(resultCollection, "An empty collection should be considered empty");
    }

    @Test
    public void testIsEmptyWithNonEmptyCollection() {
        Collection<Object> nonEmptyCollection = Arrays.asList(new Object(), new Object());

        boolean resultCollection = CollectionVerificationUtil.isEmpty(nonEmptyCollection);

        assertFalse(resultCollection, "A non-empty collection should not be considered empty");
    }

    @Test
    public void testIsNotEmptyWithNullCollection() {
        Collection<?> nullCollection = null;

        boolean result = CollectionVerificationUtil.isNotEmpty(nullCollection);

        assertFalse(result, "A null collection should not be considered non-empty");
    }

    @Test
    public void testIsNotEmptyWithEmptyCollection() {
        Collection<Object> emptyCollection = Collections.emptyList();
        boolean resultCollection = CollectionVerificationUtil.isNotEmpty(emptyCollection);

        assertFalse(resultCollection, "An empty collection should not be considered non-empty");
    }
}