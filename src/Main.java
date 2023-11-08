import java.util.Locale;
import java.util.Scanner;

public class Main {
    // C_3 = 1502 % 3 = 2 -> String
    // C_17 = 1502 % 17 = 6 -> Відсортувати слова заданого тексту за зростанням кількості голосних
    //літер.
    public static void main(String[] args) {
        Locale.setDefault(new Locale("uk", "UA"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        scanner.close();

        TextSorter.sort(text);
    }
}

