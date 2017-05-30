package org.tw.conversions;

/**
 * Created by stutis on 5/30/17.
 */
public class StringUtilities {

    public String toUpperCase(String input) throws NullAsInputException {

        if (input == null)
            throw new NullAsInputException();


        int lengthOfInput = input.length();
        if (lengthOfInput == 0) {
            return "";
        }

        String output = "";
        char currentChar;

        for (int index = 0; index < lengthOfInput; index++) {
            currentChar = input.charAt(index);
            output += convertCharToUpperCase(currentChar);
        }
        return output;
    }

    private char convertCharToUpperCase(char currentChar) {
        if (currentChar >= 'a' && currentChar <= 'z')
            return (char) (currentChar - 32);
        return currentChar;
    }


}
