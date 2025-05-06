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
      char[] rm = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
      for(int i=0; i<romanNumber.length(); i++) {
        char c = romanNumber.charAt(i);
        for(int j=0; i<rm.length; j++) {
          if(c!=rm[j]) {
            throw new IllegalArgumentException("String must be roman number"); 
          }
        }
      }
        return null;
    }

    /* Metodo accessore per test. Da rimuovere a release. */
    public static String printAsciiArtTest(String romanNumber)
      throws IllegalArgumentException {
        return printAsciiArt(romanNumber);
    }
}