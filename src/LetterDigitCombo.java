/**
 * Created by Teb0ho on 2016-12-02.
 */
public class LetterDigitCombo {

    public static void main(String[] args) {

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
        String [] letters = new String[] {"A", "A"};

        int number = 0;
        int number1 = 0;

        String combination = letters[0] + number + letters[1] + number1;

        while(!combination.contentEquals("Z9Z9")) {
            System.out.println(combination);
            number1++;


            if (number1 > 9) {
                int letterIndex = alphabet.indexOf(letters[1]) + 1;
                if (letterIndex < alphabet.length()) {
                    letters[1] = String.valueOf(alphabet.charAt(letterIndex));
                }
                else {
                    number++;
                    letters[1] = "A";
                }
                number1 = 0;
            }

            if (number > 9) {
                int letterIndex = alphabet.indexOf(letters[0]) + 1;
                if (letterIndex < alphabet.length()) {
                    letters[0] = String.valueOf(alphabet.charAt(letterIndex));
                }
                number = 0;
            }

            combination = letters[0] + number + letters[1] + number1;
        }

        System.out.println(combination);
    }
}
