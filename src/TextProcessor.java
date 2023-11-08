import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TextProcessor {
    public List<String> extractWords(String text) {
        List<String> words = new ArrayList<>();

        String[] wordArray = text.split("\\s+");

        for (String word : wordArray) {
            String cleanedWord = word.replaceAll("[^а-яА-Яa-zA-Z]", "");

            if (!cleanedWord.isEmpty()) {
                words.add(cleanedWord);
            }
        }

        if (words.isEmpty()) {
            throw new IllegalArgumentException("Text is empty");
        }

        return words;
    }

    public List<String> sortWordsByVowelsCount(List<String> words) {
        words.sort((word1, word2) -> {
            int vowelsCount1 = countVowels(word1);
            int vowelsCount2 = countVowels(word2);
            return Integer.compare(vowelsCount1, vowelsCount2);
        });

        return words;
    }

    public int countVowels(String word) {
        String lowercaseWord = word.toLowerCase();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = lowercaseWord.charAt(i);
            if ("eyuioaуеіоїєяюыиэ".indexOf(letter) != -1) {
                count++;
            }
        }
        return count;
    }

}