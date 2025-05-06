////////////////////////////////////////////////////////////////////
// QIAO QIAO CAI 2111010
// VALERIA BALEANU 2109911
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    /*
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    */

    public static String printAsciiArt(String romanNumber){
      if(romanNumber=="") { 
        throw new IllegalArgumentException("String can't be empty"); 
      }
      String art[][] = new String[10][6];
      for(int i=0; i<romanNumber.length(); i++) {
        char c = romanNumber.charAt(i);
        if(c=='I') { art[i]=printAscii_I(); }
        else if(c=='V') { art[i]=printAscii_V(); }
        else if(c=='X') { art[i]=printAscii_X(); }
        else {
            throw new IllegalArgumentException("String must be roman number"); 
        }
      }
      String out = "";
      for(int z=0; z<6; z++) {
        for(int w=0; w<art.length; w++) {
          if(art[w][z]==null) {out += "";}
          else {out += art[w][z];}
        }
        out += "\n";
      }
      return out;
    }

    private static String[] printAscii_I() {
        return new String[] {" _____  ",
                             "|_   _| ",
                             "  | |   ",
                             "  | |   ",
                             " _| |_  ",
                             "|_____| "};
    }

    private static String[] printAscii_V() {
        return new String[] {"__      __ " ,
                             "\\ \\    / / " ,
                             " \\ \\  / /  " ,
                             "  \\ \\/ /   " ,
                             "   \\  /    " ,
                             "    \\/     ", };
    }

    private static String[] printAscii_X() {
        return new String[] {"__    __ " ,
                             "\\ \\  / / " ,
                             " \\ \\/ /  " ,
                             "  >  <   " ,
                             " / /\\ \\  " ,
                             "/_/  \\_\\ " };
    }

    /* Metodo accessore per test. Da rimuovere a release. */
    public static String printAsciiArtTest(String romanNumber)
      throws IllegalArgumentException {
        return printAsciiArt(romanNumber);
    }
}