package com.powerup.value.verification.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapVerificationUtilTest {

    @Test
    public void testIsEmptyWithNullMap() {
        Map<?, ?> nullMap = null;

        boolean result = MapVerificationUtil.isEmpty(nullMap);

        assertTrue(result, "A null map should be considered empty");
    }

    @Test
    public void testIsEmptyWithEmptyMap() {
        Map<Object, Object> emptyMap = Collections.emptyMap();

        boolean resultMap = MapVerificationUtil.isEmpty(emptyMap);

        assertTrue(resultMap, "An empty map should be considered empty");
    }

    @Test
    public void testIsEmptyWithNonEmptyMap() {
        Map<Object, Object> nonEmptyMap = new HashMap<>();
        nonEmptyMap.put("key1", "value1");
        nonEmptyMap.put("key2", "value2");

        boolean resultMap = MapVerificationUtil.isEmpty(nonEmptyMap);

        assertFalse(resultMap, "A non-empty map should not be considered empty");
    }

    @Test
    public void testIsNotEmptyWithNullMap() {
        Map<?, Object> nullMap = null;

        boolean result = MapVerificationUtil.isNotEmpty(nullMap);

        assertFalse(result, "A null map should not be considered non-empty");
    }

    @Test
    public void testIsNotEmptyWithEmptyMap() {
        Map<Object, Object> emptyMap = Collections.emptyMap();
        boolean resultMap = MapVerificationUtil.isNotEmpty(emptyMap);

        assertFalse(resultMap, "An empty map should not be considered non-empty");
    }
}