package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {
    static final String point = ".";
    static final String comma = ",";
    static final String dash = "-";
    static final String colon = ":";
    static final String semicolon = ";";
    static final String exclamationMark = "!";
    static final String questionMark = "?";

    static final String splitRegex = " ";
    static final String endStr = "ay";

    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    public static String pigIt(String str) {
        String[] symbolMarks={point,comma,dash,colon,semicolon,exclamationMark,questionMark};
        String[] words = str.split(splitRegex);
        char firstLetter;
        boolean changeWord = true;

        for (String word: words){
            for (String symbolMark : symbolMarks)
                if (word.contains(symbolMark)) {
                    changeWord = false;
                    break;
                }

            if (changeWord){
                firstLetter = word.charAt(0);
                int firstLocation = 1;
                word = word.substring(firstLocation);
                word = word.replace(word, word + firstLetter + endStr);
            }
            changeWord = true;
        }

        return String.join(splitRegex, words);
    }
}
