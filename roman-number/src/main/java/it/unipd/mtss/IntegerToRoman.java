////////////////////////////////////////////////////////////////////
// QIAO QIAO CAI 2111010
// VALERIA BALEANU 2109911
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){

        if(number <= 0 || number > 1000) {
            throw new IllegalArgumentException("Number must be in 1-1000");
        }

        String[] roman={"I","II","III","IV","V","VI","VII","VIII","IX","X"};

        return roman[number-1];
    }
}