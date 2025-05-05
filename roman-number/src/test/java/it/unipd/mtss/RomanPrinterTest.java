////////////////////////////////////////////////////////////////////
// QIAO QIAO CAI 2111010
// VALERIA BALEANU 2109911
////////////////////////////////////////////////////////////////////

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
}