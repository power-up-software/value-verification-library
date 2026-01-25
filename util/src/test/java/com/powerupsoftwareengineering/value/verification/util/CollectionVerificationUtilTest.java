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