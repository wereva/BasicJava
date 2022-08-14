package task;

import java.util.Scanner;

public class Reversed {

        public static void main(String[] args) {
            System.out.println("Enter to string\n");
            Scanner scr = new Scanner(System.in);
            String s = scr.nextLine();

            String[] input = s.split(" ");
            for (int i = 0; i < input.length; i++) {
                input[i] = getReversedString(input[i]);
            }
            s = buildResult(input);
            System.out.println();
            System.out.println("String after revers\n\n" + s);
        }

    public static String getReversedString(String input) {
        char[] chars = input.toCharArray();
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


            for (char aChar : chars) {
                if (Character.isLetter(aChar)) {
                    word.append(aChar);
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
            return result.toString();
        }
    }


