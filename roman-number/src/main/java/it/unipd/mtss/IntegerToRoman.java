////////////////////////////////////////////////////////////////////
// QIAO QIAO CAI 2111010
// VALERIA BALEANU 2109911
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    
    //Metodo che esegue la conversione da numeri arabi a romani
    // da 1 fino a 1000
    //PRE: number numero intero tra 1 e 1000
    //POST: result è una stringa che rappresenta 
    // il numero romano corrispondente a number
    public static String convert(int number){

        // Controllo eccezioni. Il numero deve essere compreso tra 1 e 1000
        if(number <= 0 || number > 1000) {
            throw new IllegalArgumentException("Number must be in 1-1000");
        }

        // Corrispondenza numeri romani - arabi 'speciali'
        String[] roman = {"M","CM","D","CD","C","XC","L",
                        "XL","X","IX","V","IV","I"};
        int[] arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        //Per memorizzare il risultato
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