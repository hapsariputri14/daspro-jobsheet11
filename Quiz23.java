import java.util.Scanner;
import java.util.Random;

public class Quiz23 {

    public static void main(String[] args) {

        // Deklarasi Scanner dan Random
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Deklarasi variabel
        char menu = 'y';

        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false; // Corrected variable name

            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number); // Corrected variable name

            } while (!success);
            
            System.out.print("Apakah Anda ingin mengulang permainan (Y/T): ");
            menu = input.next().charAt(0);
            input.nextLine();

        } while (menu == 'Y' || menu == 'y');
    }
}
