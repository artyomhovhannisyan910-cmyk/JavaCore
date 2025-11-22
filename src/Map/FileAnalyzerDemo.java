package Map;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class FileAnalyzerDemo {

    public static void main(String[] args) {
        String content = " Arman Hambaryan:  Java is perfect i love Java Java is powerful";
        FileAnalyzer analyzer = new FileAnalyzer();
        Path filePath = Paths.get("sample.txt");
        try {
            Files.write(filePath, content.getBytes());
            System.out.println("Файл 'sample.txt' успешно создан!");
        } catch (IOException e) {
            System.err.println("Ошибка при создании файла: " + e.getMessage());
            return;
        }
        try {
            System.out.println("Общее количество слов: " + analyzer.totalWordCount(String.valueOf(filePath)));
            System.out.println("Уникальных слов: " + analyzer.uniqueWordCount(String.valueOf(filePath)));
            System.out.println("\nТоп-5 самых частых слов:");
            Map<String, Integer> topWords = analyzer.topFrequentWords(String.valueOf(filePath), 5);
            topWords.forEach((word, count) -> System.out.println(word + ": " + count));
            String targetWord = "java";
            int occurrences = analyzer.countWordOccurrences(String.valueOf(filePath), targetWord);
            System.out.println("\nСлово \"" + targetWord + "\" встречается: " + occurrences + " раз");
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        try {
            Files.delete(filePath);
            System.out.println("\nФайл 'sample.txt' успешно удалён.");
        } catch (IOException e) {
            System.err.println("Ошибка при удалении файла: " + e.getMessage());
        }
    }
}