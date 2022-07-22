public class Reversed {

    public static void main(String[] args) {

        String str1 = "slava hello";
        String str2 = "o1eh zinger!man";
        System.out.println(getReverseString(str1));
    }

    public static String getReverseString(String input) {
        String[] words = input.split(" ");
        String firstWord = words[0];
        String secondWord = words[1];
        char[] reversedLaterOne = new char[firstWord.length()];
        char[] lettersOne = firstWord.toCharArray();
        char[] reversedLaterTwo = new char[secondWord.length()];
        char[] lettersTwo = secondWord.toCharArray();

        for (int i = 0; i < lettersOne.length; i++) {
            boolean isLeterOne = Character.isLetter(lettersOne[i]);
            if (isLeterOne) {
                for (int j = 0; j < lettersOne.length; j++) {
                    reversedLaterOne[j] = lettersOne[lettersOne.length - 1 - j];
                }
            }
        }
        for (int i = 0; i < lettersTwo.length; i++) {
            boolean isLeterTwo = Character.isLetter(lettersTwo[i]);
            if (isLeterTwo) {
                for (int j = 0; j < lettersTwo.length; j++) {
                    reversedLaterTwo[j] = lettersTwo[lettersTwo.length - 1 - j];
                }
            }
        }
        String firstReverse = new String(reversedLaterOne);
        String secondReverse = new String(reversedLaterTwo);
        String result = firstReverse + " " + secondReverse;
        return result;
    }
}


