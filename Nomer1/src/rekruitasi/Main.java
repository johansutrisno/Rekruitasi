package rekruitasi;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cek Kata Palindrom ");

        System.out.print("Masukan kata : ");
        String kata = input.next();
        int panjang = kata.length();
        int temp = 0;
        for (int i = 0; i < kata.length(); i++) {
            if (kata.charAt(i) == kata.charAt(panjang - 1)) {
                panjang -= 1;
                temp += 1;
            } else {
                break;
            }
        }
        if (temp == kata.length()) {
            System.out.println("True");
        } else
            System.out.println("False");
    }
}
