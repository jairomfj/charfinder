package br.com.charfinder.model;

public class CharFinder {

    private static final String VOWELS = "aeiouAEIOU";

    public static char firstChar(Stream stream) {

        if(stream == null || !stream.hasNext()) {
            throw new IllegalArgumentException("CharStream cannot be null");
        }

        String string = "";
        String charCandidates = "";
        while (stream.hasNext()) {
            char charactere = stream.getNext();
            string += charactere;

            if(string.length() > 2) {
                if(matchCondition(string)) {
                    charCandidates += charactere;
                }

                if(!charIsStillUniqueOnString(charactere, string)) {
                    charCandidates = charCandidates.replace(String.valueOf(charactere), "");
                }
            }
        }

        if(charCandidates.length() == 0) {
            throw new IllegalStateException("Could not find char that matches the requirement");
        }

        return charCandidates.charAt(0);
    }

    private static boolean matchCondition(String string) {
        int stringLength = string.length();
        char actual = string.charAt(stringLength - 1);
        char last = string.charAt(stringLength - 2);
        char former = string.charAt(stringLength - 3);
        return isVowel(former) && !isVowel(last) && isVowel(actual);
    }

    private static boolean charIsStillUniqueOnString(char actual, String string) {
        return string.chars().filter(num -> num == actual).count() == 1;
    }

    private static boolean isVowel(char charactere) {
        return VOWELS.indexOf(charactere) != -1;
    }
}
