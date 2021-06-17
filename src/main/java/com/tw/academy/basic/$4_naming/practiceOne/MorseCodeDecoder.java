package com.tw.academy.basic.$4_naming.practiceOne;

public class MorseCodeDecoder {
    public static String decode(String input) {
        String morseCodeRegex = "\\s{2,}";
        String[] splits = input.split(morseCodeRegex);
        StringBuilder decodedMorseCode = new StringBuilder();
        String splitRegex = " ";
        for (String split : splits) {
            String [] splitDecodedMorseCodes = split.split(splitRegex);
            for (String splitDecodedMorseCode: splitDecodedMorseCodes) {
                decodedMorseCode.append(MorseCode.get(splitDecodedMorseCode));
            }
            decodedMorseCode.append(splitRegex);
        }
        String nullRegx = "null";
        String regxReplacementString = "";
        return decodedMorseCode.toString().replaceAll(nullRegx, regxReplacementString).trim();
    }
}
