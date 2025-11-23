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