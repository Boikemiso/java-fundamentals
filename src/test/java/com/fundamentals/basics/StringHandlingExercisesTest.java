package com.fundamentals.basics;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit Tests for StringHandlingExercises
 */
public class StringHandlingExercisesTest {

    private StringHandlingExercises exercises;

    @Before
    public void setUp() {
        exercises = new StringHandlingExercises();
    }

    @Test
    public void testGetStringLength() {
        assertEquals("'Hello' has 5 characters", 5, exercises.getStringLength("Hello"));
        assertEquals("Empty string has 0 characters", 0, exercises.getStringLength(""));
        assertEquals("'Java' has 4 characters", 4, exercises.getStringLength("Java"));
    }

    @Test
    public void testGetCharacterAtIndex() {
        char result = exercises.getCharacterAtIndex("Hello", 0);
        assertEquals("First character of 'Hello' is 'H'", 'H', result);
        
        char result2 = exercises.getCharacterAtIndex("Hello", 4);
        assertEquals("Last character of 'Hello' is 'o'", 'o', result2);
    }

    @Test
    public void testGetSubstring() {
        String result = exercises.getSubstring("Hello World", 0, 5);
        assertEquals("Substring from 0 to 5 should be 'Hello'", "Hello", result);
        
        String result2 = exercises.getSubstring("Java Programming", 5, 16);
        assertEquals("Substring from 5 to 16 should be 'Programming'", "Programming", result2);
    }

    @Test
    public void testConvertToUppercase() {
        String result = exercises.convertToUppercase("hello");
        assertEquals("'hello' uppercase should be 'HELLO'", "HELLO", result);
        
        String result2 = exercises.convertToUppercase("Java");
        assertEquals("'Java' uppercase should be 'JAVA'", "JAVA", result2);
    }

    @Test
    public void testConvertToLowercase() {
        String result = exercises.convertToLowercase("HELLO");
        assertEquals("'HELLO' lowercase should be 'hello'", "hello", result);
        
        String result2 = exercises.convertToLowercase("Java");
        assertEquals("'Java' lowercase should be 'java'", "java", result2);
    }

    @Test
    public void testAreStringsEqual() {
        assertTrue("'Hello' should equal 'Hello'", exercises.areStringsEqual("Hello", "Hello"));
        assertFalse("'Hello' should not equal 'hello'", exercises.areStringsEqual("Hello", "hello"));
    }

    @Test
    public void testAreStringsEqualIgnoreCase() {
        assertTrue("'Hello' should equal 'hello' (case-insensitive)", 
                exercises.areStringsEqualIgnoreCase("Hello", "hello"));
        assertTrue("'JAVA' should equal 'java' (case-insensitive)", 
                exercises.areStringsEqualIgnoreCase("JAVA", "java"));
        assertFalse("'Hello' should not equal 'World' (case-insensitive)", 
                exercises.areStringsEqualIgnoreCase("Hello", "World"));
    }

    @Test
    public void testStringContains() {
        assertTrue("'Hello World' should contain 'World'", 
                exercises.stringContains("Hello World", "World"));
        assertFalse("'Hello World' should not contain 'Java'", 
                exercises.stringContains("Hello World", "Java"));
    }

    @Test
    public void testFindCharacterIndex() {
        int result = exercises.findCharacterIndex("Hello", 'l');
        assertEquals("First 'l' in 'Hello' is at index 2", 2, result);
        
        int result2 = exercises.findCharacterIndex("Hello", 'x');
        assertEquals("'x' not in 'Hello' should return -1", -1, result2);
    }

    @Test
    public void testReplaceCharacter() {
        String result = exercises.replaceCharacter("Hello", 'l', 'x');
        assertEquals("Replacing 'l' with 'x' in 'Hello' should give 'Hexxo'", "Hexxo", result);
        
        String result2 = exercises.replaceCharacter("Java", 'a', 'o');
        assertEquals("Replacing 'a' with 'o' in 'Java' should give 'Jovo'", "Jovo", result2);
    }
}