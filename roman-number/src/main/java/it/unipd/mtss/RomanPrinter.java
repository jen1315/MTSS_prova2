////////////////////////////////////////////////////////////////////
// QIAO QIAO CAI 2111010
// VALERIA BALEANU 2109911
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){
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
          case 'I': out[i] = printAscii_I(); break;
          case 'V': out[i] = printAscii_V(); break;
          case 'X': out[i] = printAscii_X(); break;
          case 'L': out[i] = printAscii_L(); break;
          case 'C': out[i] = printAscii_C(); break;
          case 'D': out[i] = printAscii_D(); break;
          case 'M': out[i] = printAscii_M(); break;
          default: 
            throw new IllegalArgumentException("String must be roman number");
        }
      }
      return out;
    }

    /* Metodi che ritornano un array di stringhe dell'ascii art di un carattere
     * Ogni elemento rappresenta una riga dell'ascii art
    */
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

    private static String[] printAscii_L() {
        return new String[] {" _       ",
                             "| |      ",
                             "! |      ",
                             "| |      ",
                             "| |____  ",
                             "|______| "};
    }

    private static String[] printAscii_C() {
        return new String[] {"  _____  ",
                             " / ____| ",
                             "| |      ",
                             "| |      ",
                             "| |____  ",
                             " \\_____| "};
    }

    private static String[] printAscii_D() {
        return new String[] {" _____   " ,
                             "|  __ \\  ",
                             "| |  | | " ,
                             "| |  | | " ,
                             "| |__| | " ,
                             "|_____/  "};
    }

    private static String[] printAscii_M() {
        return new String[] {" __  __  "  ,
                             "|  \\/  | ",
                             "| \\  / | " ,
                             "| |\\/| | " ,
                             "| |  | | "  ,
                             "|_|  |_| ",};
    }

    /* Metodo accessore per test. Da rimuovere a release. */
    public static String printAsciiArtTest(String romanNumber)
      throws IllegalArgumentException {
        return printAsciiArt(romanNumber);
    }
}