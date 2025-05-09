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
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(-1));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(0));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(1001));
    }

    @Test
    public void TestPrintAscii_1to3() {
        assertEquals("  _____   \n" +
                     " |_   _|  \n" +
                     "   | |    \n" +
                     "   | |    \n" +
                     "  _| |_   \n" +
                     " |_____|  \n", RomanPrinter.print(1));
        assertEquals("  _____     _____   \n" +
                     " |_   _|   |_   _|  \n" +
                     "   | |       | |    \n" +
                     "   | |       | |    \n" +
                     "  _| |_     _| |_   \n" +
                     " |_____|   |_____|  \n", RomanPrinter.print(2));
        assertEquals("  _____     _____     _____   \n" +
                     " |_   _|   |_   _|   |_   _|  \n" +
                     "   | |       | |       | |    \n" +
                     "   | |       | |       | |    \n" +
                     "  _| |_     _| |_     _| |_   \n" +
                     " |_____|   |_____|   |_____|  \n", RomanPrinter.print(3));
    }

    @Test
    public void TestPrintAscii_4to6() {
        assertEquals("  _____   __      __\n" +
                     " |_   _|  \\ \\    / /\n" +
                     "   | |     \\ \\  / / \n" +
                     "   | |      \\ \\/ /  \n" +
                     "  _| |_      \\  /   \n" +
                     " |_____|      \\/    \n", RomanPrinter.print(4));
        assertEquals("__      __\n" +
                     "\\ \\    / /\n" +
                     " \\ \\  / / \n" +
                     "  \\ \\/ /  \n" +
                     "   \\  /   \n" +
                     "    \\/    \n", RomanPrinter.print(5));
        assertEquals("__      __  _____   \n" +
                     "\\ \\    / / |_   _|  \n" +
                     " \\ \\  / /    | |    \n" +
                     "  \\ \\/ /     | |    \n" +
                     "   \\  /     _| |_   \n" +
                     "    \\/     |_____|  \n", RomanPrinter.print(6));
    }

    @Test
    public void TestPrintAscii_7to10() {
        assertEquals("__      __  _____     _____   \n" +
                     "\\ \\    / / |_   _|   |_   _|  \n" +
                     " \\ \\  / /    | |       | |    \n" +
                     "  \\ \\/ /     | |       | |    \n" +
                     "   \\  /     _| |_     _| |_   \n" +
                     "    \\/     |_____|   |_____|  \n", RomanPrinter.print(7));
        assertEquals("__      __  _____     _____     _____   \n" +
                     "\\ \\    / / |_   _|   |_   _|   |_   _|  \n" +
                     " \\ \\  / /    | |       | |       | |    \n" +
                     "  \\ \\/ /     | |       | |       | |    \n" +
                     "   \\  /     _| |_     _| |_     _| |_   \n" +
                     "    \\/     |_____|   |_____|   |_____|  \n", RomanPrinter.print(8));
        assertEquals("  _____    __    __ \n" +
                     " |_   _|   \\ \\  / / \n" +
                     "   | |      \\ \\/ /  \n" +
                     "   | |       >  <   \n" +
                     "  _| |_     / /\\ \\  \n" +
                     " |_____|   /_/  \\_\\ \n", RomanPrinter.print(9));
        assertEquals(" __    __ \n" +
                     " \\ \\  / / \n" +
                     "  \\ \\/ /  \n" +
                     "   >  <   \n" +
                     "  / /\\ \\  \n" +
                     " /_/  \\_\\ \n", RomanPrinter.print(10));
    } 

    @Test
    public void TestPrintAscii_to50() {
        assertEquals(" __    __   _____    __    __ \n" +
                     " \\ \\  / /  |_   _|   \\ \\  / / \n" +
                     "  \\ \\/ /     | |      \\ \\/ /  \n" +
                     "   >  <      | |       >  <   \n" +
                     "  / /\\ \\    _| |_     / /\\ \\  \n" +
                     " /_/  \\_\\  |_____|   /_/  \\_\\ \n", RomanPrinter.print(19));
        assertEquals(" __    __  __    __  __    __ __      __  _____     _____     _____   \n" +
                     " \\ \\  / /  \\ \\  / /  \\ \\  / / \\ \\    / / |_   _|   |_   _|   |_   _|  \n" +
                     "  \\ \\/ /    \\ \\/ /    \\ \\/ /   \\ \\  / /    | |       | |       | |    \n" +
                     "   >  <      >  <      >  <     \\ \\/ /     | |       | |       | |    \n" +
                     "  / /\\ \\    / /\\ \\    / /\\ \\     \\  /     _| |_     _| |_     _| |_   \n" +
                     " /_/  \\_\\  /_/  \\_\\  /_/  \\_\\     \\/     |_____|   |_____|   |_____|  \n", RomanPrinter.print(38));
        assertEquals(" __    __   _         _____    __    __ \n" +
                     " \\ \\  / /  | |       |_   _|   \\ \\  / / \n" +
                     "  \\ \\/ /   ! |         | |      \\ \\/ /  \n" +
                     "   >  <    | |         | |       >  <   \n" +
                     "  / /\\ \\   | |____    _| |_     / /\\ \\  \n" +
                     " /_/  \\_\\  |______|  |_____|   /_/  \\_\\ \n", RomanPrinter.print(49));
        assertEquals("  _       \n" +
                     " | |      \n" +
                     " ! |      \n" +
                     " | |      \n" +
                     " | |____  \n" +
                     " |______| \n", RomanPrinter.print(50));
    }

    @Test
    public void TestPrintAscii_to100() {
        assertEquals("  _       __      __\n" +
                     " | |      \\ \\    / /\n" +
                     " ! |       \\ \\  / / \n" +
                     " | |        \\ \\/ /  \n" +
                     " | |____     \\  /   \n" +
                     " |______|     \\/    \n", RomanPrinter.print(55));
        assertEquals("  _        __    __  __    __  __    __ __      __  _____     _____     _____   \n" +
                     " | |       \\ \\  / /  \\ \\  / /  \\ \\  / / \\ \\    / / |_   _|   |_   _|   |_   _|  \n" +
                     " ! |        \\ \\/ /    \\ \\/ /    \\ \\/ /   \\ \\  / /    | |       | |       | |    \n" +
                     " | |         >  <      >  <      >  <     \\ \\/ /     | |       | |       | |    \n" +
                     " | |____    / /\\ \\    / /\\ \\    / /\\ \\     \\  /     _| |_     _| |_     _| |_   \n"  +
                     " |______|  /_/  \\_\\  /_/  \\_\\  /_/  \\_\\     \\/     |_____|   |_____|   |_____|  \n", RomanPrinter.print(88));
        assertEquals(" __    __    _____    _____    __    __ \n" +
                     " \\ \\  / /   / ____|  |_   _|   \\ \\  / / \n" +
                     "  \\ \\/ /   | |         | |      \\ \\/ /  \n" +
                     "   >  <    | |         | |       >  <   \n" +
                     "  / /\\ \\   | |____    _| |_     / /\\ \\  \n"  +
                     " /_/  \\_\\   \\_____|  |_____|   /_/  \\_\\ \n", RomanPrinter.print(99));
        assertEquals("   _____  \n" +
                     "  / ____| \n" +
                     " | |      \n" +
                     " | |      \n" +
                     " | |____  \n"  +
                     "  \\_____| \n", RomanPrinter.print(100));
    }

    @Test
    public void TestPrintAscii_to500() {
        assertEquals("   _____  __      __\n" +
                     "  / ____| \\ \\    / /\n" +
                     " | |       \\ \\  / / \n" +
                     " | |        \\ \\/ /  \n" +
                     " | |____     \\  /   \n" +
                     "  \\_____|     \\/    \n", RomanPrinter.print(105));
        assertEquals("   _____     _____     _____    _        __    __  __    __  __    __ __      __  _____     _____     _____   \n" +
                     "  / ____|   / ____|   / ____|  | |       \\ \\  / /  \\ \\  / /  \\ \\  / / \\ \\    / / |_   _|   |_   _|   |_   _|  \n" +
                     " | |       | |       | |       ! |        \\ \\/ /    \\ \\/ /    \\ \\/ /   \\ \\  / /    | |       | |       | |    \n" +
                     " | |       | |       | |       | |         >  <      >  <      >  <     \\ \\/ /     | |       | |       | |    \n" +
                     " | |____   | |____   | |____   | |____    / /\\ \\    / /\\ \\    / /\\ \\     \\  /     _| |_     _| |_     _| |_   \n"  +
                     "  \\_____|   \\_____|   \\_____|  |______|  /_/  \\_\\  /_/  \\_\\  /_/  \\_\\     \\/     |_____|   |_____|   |_____|  \n", RomanPrinter.print(388));
        assertEquals("   _____    _____     _____    __    __ \n" +
                     "  / ____|  |  __ \\   |_   _|   \\ \\  / / \n" +
                     " | |       | |  | |    | |      \\ \\/ /  \n" +
                     " | |       | |  | |    | |       >  <   \n" +
                     " | |____   | |__| |   _| |_     / /\\ \\  \n"  +
                     "  \\_____|  |_____/   |_____|   /_/  \\_\\ \n", RomanPrinter.print(409));
        assertEquals("  _____   \n" +
                     " |  __ \\  \n" +
                     " | |  | | \n" +
                     " | |  | | \n" +
                     " | |__| | \n"  +
                     " |_____/  \n", RomanPrinter.print(500));
    }

    @Test
    public void TestPrintAscii_to1000() {
        assertEquals("  _____   __      __\n" +
                     " |  __ \\  \\ \\    / /\n" +
                     " | |  | |  \\ \\  / / \n" +
                     " | |  | |   \\ \\/ /  \n" +
                     " | |__| |    \\  /   \n" +
                     " |_____/      \\/    \n", RomanPrinter.print(505));
        assertEquals("  _____      _____     _____     _____    _        __    __  __    __  __    __ __      __  _____     _____     _____   \n" +
                     " |  __ \\    / ____|   / ____|   / ____|  | |       \\ \\  / /  \\ \\  / /  \\ \\  / / \\ \\    / / |_   _|   |_   _|   |_   _|  \n" +
                     " | |  | |  | |       | |       | |       ! |        \\ \\/ /    \\ \\/ /    \\ \\/ /   \\ \\  / /    | |       | |       | |    \n" +
                     " | |  | |  | |       | |       | |       | |         >  <      >  <      >  <     \\ \\/ /     | |       | |       | |    \n" +
                     " | |__| |  | |____   | |____   | |____   | |____    / /\\ \\    / /\\ \\    / /\\ \\     \\  /     _| |_     _| |_     _| |_   \n"  +
                     " |_____/    \\_____|   \\_____|   \\_____|  |______|  /_/  \\_\\  /_/  \\_\\  /_/  \\_\\     \\/     |_____|   |_____|   |_____|  \n", RomanPrinter.print(888));
        assertEquals("   _____    __  __   __    __    _____    _____    __    __ \n" +
                     "  / ____|  |  \\/  |  \\ \\  / /   / ____|  |_   _|   \\ \\  / / \n" +
                     " | |       | \\  / |   \\ \\/ /   | |         | |      \\ \\/ /  \n" +
                     " | |       | |\\/| |    >  <    | |         | |       >  <   \n" +
                     " | |____   | |  | |   / /\\ \\   | |____    _| |_     / /\\ \\  \n"  +
                     "  \\_____|  |_|  |_|  /_/  \\_\\   \\_____|  |_____|   /_/  \\_\\ \n", RomanPrinter.print(999));
        assertEquals("  __  __  \n" +
                     " |  \\/  | \n" +
                     " | \\  / | \n" +
                     " | |\\/| | \n" +
                     " | |  | | \n"  +
                     " |_|  |_| \n", RomanPrinter.print(1000));
    }

    /* Test di Inverse di Right-BICEP */
    public String reversePrint(String asciiArt) {
        if(asciiArt=="") {
            throw new IllegalArgumentException("String can't be empty");
        }
        String rmArt[][] = {{"  _____   "," |_   _|  ","   | |    ","   | |    ","  _| |_   "," |_____|  "}, 
                            {"__      __","\\ \\    / /"," \\ \\  / / ","  \\ \\/ /  ","   \\  /   ","    \\/    "},
                            {" __    __ "," \\ \\  / / ","  \\ \\/ /  ","   >  <   ","  / /\\ \\  "," /_/  \\_\\ "},
                            {"  _       "," | |      "," ! |      "," | |      "," | |____  "," |______| "},
                            {"   _____  ","  / ____| "," | |      "," | |      "," | |____  ","  \\_____| "},
                            {"  _____   "," |  __ \\  "," | |  | | "," | |  | | "," | |__| | "," |_____/  "},
                            {"  __  __  "," |  \\/  | "," | \\  / | "," | |\\/| | "," | |  | | "," |_|  |_| "}};
        String rm[] = {"I", "V", "X", "L", "C", "D", "M"};
        String aa[] = asciiArt.split("\\n+");
        aa = aa[1].split("(?<=\\G.{10})");
        String romanNumber = "";

        for(int i=0; i<aa.length; i++) {
            for(int j=0; j<rmArt.length; j++) {
                if(aa[i].equals(rmArt[j][1])) {
                    romanNumber += rm[j];
                }
            }
        }
        return romanNumber.toString();
    }

    @Test
    public void reversePrintTest() {
        for(int i=1; i<1001; i++) {
            assertEquals(i, IntegerToRomanTest.reverseConvert(reversePrint(RomanPrinter.print(i))));
        }
    }

    /* Test di Cross-examination e Performance di Right-BICEP 
     * TODO
    */
}