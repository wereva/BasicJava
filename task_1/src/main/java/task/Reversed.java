package task;

import java.util.Scanner;

public class Reversed {

        public static void main(String[] args) {
            System.out.println("Enter to string\n");
            Scanner scr = new Scanner(System.in);
            String input = scr.nextLine();
            String[] word = splitStringIntoWords(input);
            System.out.println("\nString after revers\n\n" + buildResult(word));
        }

    public static String[] splitStringIntoWords(String input) {
        String[] word = input.split(" ");
        for (int i = 0; i < word.length; i++) {
            word[i] = getReversedWord(word[i]);
        }
        return word;
    }

    public static String getReversedWord(String word) {
        char[] chars = word.toCharArray();
        String wordReversed = String.valueOf(getReversedLettersArr(chars));
        StringBuilder wordResult = new StringBuilder();
        char[] wordReversedArray = wordReversed.toCharArray();

        for (int i = 0, j = 0; i < chars.length; i++) {
            if (!Character.isLetter(chars[i])) {
                wordResult.append(chars[i]);
                j++;
            } else {
                wordResult.append(wordReversedArray[i - j]);
            }
        }
        return wordResult.toString();
    }

        public static char[] getReversedLettersArr(char[] chars) {
            StringBuilder word = new StringBuilder();

            for (char currentChar : chars) {
                if (Character.isLetter(currentChar)) {
                    word.append(currentChar);
                }
            }
            return word.reverse().toString().toCharArray();
        }

        public static String buildResult(String[] input) {
            StringBuilder result = new StringBuilder();
            for (String s : input) {
                result.append(s);
                result.append(" ");

            }
            return result.toString().trim();
        }
    }


