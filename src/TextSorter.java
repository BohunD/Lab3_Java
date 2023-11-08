import java.util.List;

public class TextSorter {
    public static void sort(String str) {
        try {
            TextProcessor textProcessor = new TextProcessor();
            List<String> words = textProcessor.extractWords(str);
            List<String> sortedWords = textProcessor.sortWordsByVowelsCount(words);

            System.out.println("Sorted words:");
            for (String word : sortedWords) {
                System.out.println(word);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}