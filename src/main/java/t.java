import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Helló neved?");
        String name = scanner.nextLine();
        System.out.println("Helló "+name+"! Melyik évben születtél?");
        int age = 2021-scanner.nextInt();

        System.out.println("Hát akkor te "+age+" éves vagy!");
    }
}