import java.util.*;

public class StopWordFilteredWordFrequencyReport {

    public static void printFilteredWordFrequency(String feedback) {

        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        Set<String> stopWordSet = new HashSet<>(Arrays.asList(stopWords));

        String cleaned = feedback.toLowerCase()
                .replace(".", "")
                .replace(",", "");

        String[] words = cleaned.split("\\s+");

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (!stopWordSet.contains(word)) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> entries =
                new ArrayList<>(frequency.entrySet());

        entries.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter feedback: ");
        String feedback = scanner.nextLine();

        printFilteredWordFrequency(feedback);

        scanner.close();
    }
}
