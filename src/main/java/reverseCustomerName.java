import java.util.Scanner;

public class ReverseCustomerName {

    public static String reverseName(String name) {
        StringBuilder reversed = new StringBuilder(name);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.println("Reversed name: " + reverseName(name));

        scanner.close();
    }
}
