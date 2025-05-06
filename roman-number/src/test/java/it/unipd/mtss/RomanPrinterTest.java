
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanPrinterTest {
    
    @Test
    public void TestExceptions() {
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.printAsciiArtTest(""));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.printAsciiArtTest("ABCD"));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.printAsciiArtTest("1234"));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.printAsciiArtTest("?!&/"));
    }

    @Test
    public void TestPrintAscii_1to3() {
        assertEquals(" _____  \n" +
                     "|_   _| \n" +
                     "  | |   \n" +
                     "  | |   \n" +
                     " _| |_  \n" +
                     "|_____| \n", RomanPrinter.printAsciiArtTest("I"));
        assertEquals(" _____   _____  \n" +
                     "|_   _| |_   _| \n" +
                     "  | |     | |   \n" +
                     "  | |     | |   \n" +
                     " _| |_   _| |_  \n" +
                     "|_____| |_____| \n", RomanPrinter.printAsciiArtTest("II"));
        assertEquals(" _____   _____   _____  \n" +
                     "|_   _| |_   _| |_   _| \n" +
                     "  | |     | |     | |   \n" +
                     "  | |     | |     | |   \n" +
                     " _| |_   _| |_   _| |_  \n" +
                     "|_____| |_____| |_____| \n", RomanPrinter.printAsciiArtTest("III"));
    }

    @Test
    public void TestPrintAscii_4to6() {
        assertEquals(" _____  __      __ \n" +
                     "|_   _| \\ \\    / / \n" +
                     "  | |    \\ \\  / /  \n" +
                     "  | |     \\ \\/ /   \n" +
                     " _| |_     \\  /    \n" +
                     "|_____|     \\/     \n", RomanPrinter.printAsciiArtTest("IV"));
        assertEquals("__      __ \n" +
                     "\\ \\    / / \n" +
                     " \\ \\  / /  \n" +
                     "  \\ \\/ /   \n" +
                     "   \\  /    \n" +
                     "    \\/     \n", RomanPrinter.printAsciiArtTest("V"));
        assertEquals("__      __  _____  \n" +
                     "\\ \\    / / |_   _| \n" +
                     " \\ \\  / /    | |   \n" +
                     "  \\ \\/ /     | |   \n" +
                     "   \\  /     _| |_  \n" +
                     "    \\/     |_____| \n", RomanPrinter.printAsciiArtTest("VI"));
    }

    @Test
    public void TestPrintAscii_7to10() {
        assertEquals("__      __  _____   _____  \n" +
                     "\\ \\    / / |_   _| |_   _| \n" +
                     " \\ \\  / /    | |     | |   \n" +
                     "  \\ \\/ /     | |     | |   \n" +
                     "   \\  /     _| |_   _| |_  \n" +
                     "    \\/     |_____| |_____| \n", RomanPrinter.printAsciiArtTest("VII"));
        assertEquals("__      __  _____   _____   _____  \n" +
                     "\\ \\    / / |_   _| |_   _| |_   _| \n" +
                     " \\ \\  / /    | |     | |     | |   \n" +
                     "  \\ \\/ /     | |     | |     | |   \n" +
                     "   \\  /     _| |_   _| |_   _| |_  \n" +
                     "    \\/     |_____| |_____| |_____| \n", RomanPrinter.printAsciiArtTest("VIII"));
        assertEquals(" _____  __    __ \n" +
                     "|_   _| \\ \\  / / \n" +
                     "  | |    \\ \\/ /  \n" +
                     "  | |     >  <   \n" +
                     " _| |_   / /\\ \\  \n" +
                     "|_____| /_/  \\_\\ \n", RomanPrinter.printAsciiArtTest("IX"));
        assertEquals("__    __ \n" +
                     "\\ \\  / / \n" +
                     " \\ \\/ /  \n" +
                     "  >  <   \n" +
                     " / /\\ \\  \n" +
                     "/_/  \\_\\ \n", RomanPrinter.printAsciiArtTest("X"));
    }
}