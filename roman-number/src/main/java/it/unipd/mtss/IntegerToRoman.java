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

        // Corrispondenza numeri romani - arabi 'speciali'
        String[] roman = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arab = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();

        for(int i=0; i<arab.length; i++) {
            while(number >= arab[i]) {
                result.append(roman[i]);
                number -= arab[i];
            }
        }

        return result.toString();
    }
}