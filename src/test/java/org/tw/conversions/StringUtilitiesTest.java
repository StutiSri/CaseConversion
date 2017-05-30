package org.tw.conversions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.rules.ExpectedException;

/**
 * Created by stutis on 5/30/17.
 */
public class StringUtilitiesTest {

    private StringUtilities stringUtilities;


    @Before
    public void setUp() {

        stringUtilities = new StringUtilities();
    }

    @Test
    public void shouldConvertEmptyAsEmptyString() throws NullAsInputException {
        assertEquals("", stringUtilities.toUpperCase(""));
    }

    @Test
    public void shouldConvertLowerCaseStringToUpperCase() throws NullAsInputException {
        assertEquals("HEY", stringUtilities.toUpperCase("hey"));
    }


    @Test
    public void shouldConvertUpperCaseStringToUpperCase() throws NullAsInputException {
        assertEquals("HELLO", stringUtilities.toUpperCase("HELLO"));
    }

    @Test
    public void shouldConvertCamelCaseStringToUpperCase() throws NullAsInputException {
        assertEquals("HELLO", stringUtilities.toUpperCase("HelLO"));
    }

    @Test
    public void shouldConvertStringsWithSpecialCharactersToUpperCase() throws NullAsInputException {
        assertEquals("HEL LO THIS IS STRING CONVERSION", stringUtilities.toUpperCase("Hel LO This IS String " +
                "ConvErsion"));
    }

    @Test
    public void shouldThrowExceptionWithNullInput() {
        try {
            stringUtilities.toUpperCase(null);
            Assert.fail("No NullAsInputException was thrown.");
        } catch (NullAsInputException e) {
        } catch (Exception e) {
            Assert.fail("Expected - NullAsInputException, caught - " + e.toString());
        }
    }

}
