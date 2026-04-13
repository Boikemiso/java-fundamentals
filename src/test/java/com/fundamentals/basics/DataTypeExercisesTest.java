package com.fundamentals.basics;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit Tests for DataTypeExercises
 * 
 * These tests validate your implementations of the data type exercises.
 * Green checkmark = Your code is correct
 * Red X = Your code needs fixing
 * 
 * DO NOT modify this file. Use it to check your work!
 */
public class DataTypeExercisesTest {

    private DataTypeExercises exercises;

    @Before
    public void setUp() {
        exercises = new DataTypeExercises();
    }

    @Test
    public void testDeclareAllPrimitiveTypes() {
        Object[] result = exercises.declareAllPrimitiveTypes();
        assertNotNull("Result should not be null", result);
        assertEquals("Should return array of 8 elements", 8, result.length);
        
        // Check that array contains all 8 types
        assertTrue("Should contain a byte", containsType(result, Byte.class));
        assertTrue("Should contain a short", containsType(result, Short.class));
        assertTrue("Should contain an int", containsType(result, Integer.class));
        assertTrue("Should contain a long", containsType(result, Long.class));
        assertTrue("Should contain a float", containsType(result, Float.class));
        assertTrue("Should contain a double", containsType(result, Double.class));
        assertTrue("Should contain a boolean", containsType(result, Boolean.class));
        assertTrue("Should contain a char", containsType(result, Character.class));
    }

    @Test
    public void testGetMaxIntValue() {
        int maxInt = exercises.getMaxIntValue();
        assertEquals("Max int should be 2147483647", 2147483647, maxInt);
    }

    @Test
    public void testGetMinIntValue() {
        int minInt = exercises.getMinIntValue();
        assertEquals("Min int should be -2147483648", -2147483648, minInt);
    }

    @Test
    public void testDeclareByte() {
        byte value = exercises.declareByte();
        assertTrue("Byte should be >= -128", value >= -128);
        assertTrue("Byte should be <= 127", value <= 127);
    }

    @Test
    public void testDeclareShort() {
        short value = exercises.declareShort();
        assertTrue("Short should be >= -32768", value >= -32768);
        assertTrue("Short should be <= 32767", value <= 32767);
    }

    @Test
    public void testDeclareLong() {
        long value = exercises.declareLong();
        assertTrue("Should return a long value", value > 0);
    }

    @Test
    public void testDeclareFloat() {
        float value = exercises.declareFloat();
        assertTrue("Should return a float value", value > 0);
    }

    @Test
    public void testDeclareDouble() {
        double value = exercises.declareDouble();
        assertTrue("Should return a double value", value > 0);
    }

    @Test
    public void testDeclareBoolean() {
        boolean value = exercises.declareBoolean();
        assertTrue("Should return a boolean", ((Object) value) instanceof Boolean);
    }

    @Test
    public void testDeclareChar() {
        char value = exercises.declareChar();
        assertTrue("Should return a character", Character.isValidCodePoint(value));
    }

    @Test
    public void testAdd() {
        assertEquals("5 + 3 should be 8", 8, exercises.add(5, 3));
        assertEquals("10 + 0 should be 10", 10, exercises.add(10, 0));
        assertEquals("-5 + 3 should be -2", -2, exercises.add(-5, 3));
    }

    @Test
    public void testCalculateAverage() {
        double result = exercises.calculateAverage(10, 20, 30);
        assertEquals("Average of 10, 20, 30 should be 20.0", 20.0, result, 0.01);
        
        result = exercises.calculateAverage(5, 10, 15);
        assertEquals("Average of 5, 10, 15 should be 10.0", 10.0, result, 0.01);
    }

    // Helper method to check if array contains a specific type
    private boolean containsType(Object[] array, Class<?> targetType) {
        for (Object obj : array) {
            if (obj != null && obj.getClass() == targetType) {
                return true;
            }
        }
        return false;
    }
}