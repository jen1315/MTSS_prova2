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

    private static String printAsciiArt(String romanNumber){
      if(romanNumber=="") {
        throw new IllegalArgumentException("String can't be empty"); 
      }
      String rm[][] = composeAscii(romanNumber);
      String art = "";
      
      /* Accedi alla z riga di ogni w stringa in rm e concatenale.
       * Vai a capo e continua così con le righe z successive.
       */
      for(int z=0; z<6; z++) {
        for(int w=0; w<rm.length; w++) {
          if(rm[w][z]!=null) {
            art += rm[w][z];
          }
        }
        art += "\n";
      }
      return art;
    }

    private static String[][] composeAscii(String romanNumber) {
      String out[][] = new String[10][6];
      for(int i=0; i<romanNumber.length(); i++) {
        char c = romanNumber.charAt(i);
        switch(c) {
          case 'I': out[i]=printAscii_I(); break;
          case 'V': out[i]=printAscii_V(); break;
          case 'X': out[i]=printAscii_X(); break;
          default: 
            throw new IllegalArgumentException("String must be roman number");
        }
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