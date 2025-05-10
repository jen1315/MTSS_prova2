////////////////////////////////////////////////////////////////////
// QIAO QIAO CAI 2111010
// VALERIA BALEANU 2109911
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.lang.Math;

public class IntegerToRomanTest {
    @Test
    public void TestExceptions() {
        //TEST PER LE ECCEZIONI
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(0));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(-1));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(1001));
    }

    @Test
    public void TestConvert() {
        //TEST PRINCIPALE
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
        assertEquals("VII", IntegerToRoman.convert(7));
        assertEquals("VIII", IntegerToRoman.convert(8));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));

        assertEquals("XV", IntegerToRoman.convert(15));
        assertEquals("XIX", IntegerToRoman.convert(19));
        assertEquals("XX", IntegerToRoman.convert(20));
        assertEquals("XXIX", IntegerToRoman.convert(29));
        assertEquals("XXX", IntegerToRoman.convert(30));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("L", IntegerToRoman.convert(50));

        assertEquals("LX", IntegerToRoman.convert(60));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("C", IntegerToRoman.convert(100));

        assertEquals("CC", IntegerToRoman.convert(200));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("D", IntegerToRoman.convert(500));

        assertEquals("DC", IntegerToRoman.convert(600));
        assertEquals("CM", IntegerToRoman.convert(900));
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    //Metodo inverso a IntegerToRoman.convert()
    //PRE: roman è una stringa composta da simboli romani e rappresenta un numero romano da 1 (I) fino a 1000 (M)
    //POST: total è un intero positivo che rappresenta il numero arabo corrispondente a roman
    public static int reverseConvert(String roman) {
        int total = 0;
        int prevValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {

            char c = roman.charAt(i);
            int value = getRomanValue(c);

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }
            prevValue = value;
        }
        return total;
    }

    //Metodo accessorio a reverseConvert
    private static int getRomanValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0; // Valore di default
    }

    @Test
    public void TestReverseConvert() {
        for(int i=1; i<=1000; i++) {
            assertEquals(i, reverseConvert(IntegerToRoman.convert(i)));
        }
    }

    // Metodo alternativo a IntegerToRoman.convert
    //PRE: number numero intero tra 1 e 1000
    //POST: result stringa che rappresenta il numero romano corrispondente a number
    public static String convertAlternative(int number) {
        if (number <= 0 || number > 1000) {
            throw new IllegalArgumentException("Number must be in 1-1000");
        }
        StringBuilder result = new StringBuilder();
        
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {
            "M", "CM", "D", "CD", "C", "XC", "L",
            "XL", "X", "IX", "V", "IV", "I"
        };
        
        int i = 0;
        while (number > 0) {
            if (number >= values[i]) {
                result.append(numerals[i]);
                number -= values[i];
            } else {
                i++;
            }
        }
        return result.toString();
    }

    @Test
    public void TestConvertAlternative() {
        for(int i=1; i<=1000; i++) {
            assertEquals(IntegerToRoman.convert(i), convertAlternative(i));
        }
    }

    @Test
    public void performanceConvertAlternative() {
        long startTime = System.currentTimeMillis();
        for(int j=0; j<1000; j++) {
            for(int i=1; i<=1000; i++) {
                IntegerToRoman.convert(i);
            }
        }
        long endTime = System.currentTimeMillis();
        long convertTime = endTime-startTime;
        System.out.println("convert: " + convertTime);

        startTime = System.currentTimeMillis();
        for(int j=0; j<1000; j++) {
            for(int i=1; i<=1000; i++) {
                convertAlternative(i);
            }
        }
        endTime = System.currentTimeMillis();
        long altTime = (endTime-startTime);
        System.out.println("convertAlternative: " + altTime);
    }
}