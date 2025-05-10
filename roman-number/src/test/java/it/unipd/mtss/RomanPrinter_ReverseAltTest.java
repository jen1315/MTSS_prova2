////////////////////////////////////////////////////////////////////
// QIAO QIAO CAI 2111010
// VALERIA BALEANU 2109911
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanPrinter_ReverseAltTest {

    /* Test di Inverse di Right-BICEP */
    static String rmArt[][] = {
        {"  _____   ",
         " |_   _|  ",
         "   | |    ",
         "   | |    ",
         "  _| |_   ",
         " |_____|  "}, 
        {"__      __",
         "\\ \\    / /",
         " \\ \\  / / ",
         "  \\ \\/ /  ",
         "   \\  /   ",
         "    \\/    "}, 
        {" __    __ ",
         " \\ \\  / / ",
         "  \\ \\/ /  ",
         "   >  <   ",
         "  / /\\ \\  ",
         " /_/  \\_\\ "}, 
        {"  _       ",
         " | |      ",
         " ! |      ",
         " | |      ",
         " | |____  ",
         " |______| "},
        {"   _____  ",
         "  / ____| ",
         " | |      ",
         " | |      ",
         " | |____  ",
         "  \\_____| "},
        {"  _____   ",
         " |  __ \\  ",
         " | |  | | ",
         " | |  | | ",
         " | |__| | ",
         " |_____/  "},
        {"  __  __  ",
         " |  \\/  | ",
         " | \\  / | ",
         " | |\\/| | ",
         " | |  | | ",
         " |_|  |_| "}};
    static String rmChar[] = {"I", "V", "X", "L", "C", "D", "M"};

    public static String reversePrint(String asciiArt) {
        if(asciiArt=="") {
            throw new IllegalArgumentException("String can't be empty");
        }
        String aa[] = asciiArt.split("\\n+");
        aa = aa[1].split("(?<=\\G.{10})");
        String romanNumber = "";

        for(int i=0; i<aa.length; i++) {
            for(int j=0; j<rmArt.length; j++) {
                if(aa[i].equals(rmArt[j][1])) {
                    romanNumber += rmChar[j];
                }
            }
        }
        return romanNumber;
    }

    @Test
    public void reversePrintTest() {
        for(int i=1; i<1001; i++) {
            assertEquals(i, IntegerToRomanTest.reverseConvert(reversePrint(RomanPrinter.print(i))));
        }
    }

    /* Test di Cross-examination e Performance di Right-BICEP */
    public static String printAsciiAlter(String romanNumber) {
        if(romanNumber=="") {
            throw new IllegalArgumentException("String can't be empty"); 
        }
        String rm[][] = composeAscii(romanNumber);
        String asciiArt = "";
        
        /* Accedi alla riga i di ogni array stringa(ascii art di carattere) j 
         * in rm e concatenale. Aggiungi il carattere escape \n alla fine.
         * Continua così con le righe z successive.
         */
        for(int i=0; i<6; i++) {
            for(int j=0; j<rm.length; j++) {
                if(rm[j][i]!=null) {
                    asciiArt += rm[j][i];
                }
            }
            asciiArt += "\n";
        }
        return asciiArt;
    }
    
    private static String[][] composeAscii(String romanNumber) {
        String out[][] = new String[12][6];
        for(int i=0; i<romanNumber.length(); i++) {
            char c = Character.toUpperCase(romanNumber.charAt(i));
            switch(c) {
                case 'I': out[i] = rmArt[0]; break;
                case 'V': out[i] = rmArt[1]; break;
                case 'X': out[i] = rmArt[2]; break;
                case 'L': out[i] = rmArt[3]; break;
                case 'C': out[i] = rmArt[4]; break;
                case 'D': out[i] = rmArt[5]; break;
                case 'M': out[i] = rmArt[6]; break;
                default: 
                    throw new IllegalArgumentException("String must be roman number");
            }
        }
        return out;
    }

    public static String printAlt(int num){
        return printAsciiAlter(IntegerToRoman.convert(num));
    }

    @Test
    public void TestConvertAlternative() {
        for(int i=1; i<=1000; i++) {
            assertEquals(RomanPrinter.print(i), printAlt(i));
        }
    }

    @Test
    public void performancePrintTest() {
        long startTime = System.currentTimeMillis();
        for(int j=0; j<1000; j++) {
            for(int i=1; i<=1000; i++) {
                RomanPrinter.print(i);
            }
        }
        long endTime = System.currentTimeMillis();
        long printTime = endTime-startTime;
        System.out.println("print :" + printTime);

        startTime = System.currentTimeMillis();
        for(int j=0; j<1000; j++) {
            for(int i=1; i<=1000; i++) {
                printAlt(i);
            }
        }
        endTime = System.currentTimeMillis();
        long altTime = endTime-startTime;
        System.out.println("printAlternative: " + altTime);

    }
}