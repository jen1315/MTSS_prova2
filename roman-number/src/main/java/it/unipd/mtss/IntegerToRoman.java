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
        String[] roman = {"I", "IV", "V", "VI", "IX", "X", "XL", "L"};
        int[] arab = {1, 4, 5, 6, 9, 10, 40, 50};
        StringBuilder result = new StringBuilder();

        for(int i=arab.length-1; i>=0; i--) {
            while(number >= arab[i]) {
                result.append(roman[i]);
                number -= arab[i];
            }
        }

        return result.toString();
    }
}