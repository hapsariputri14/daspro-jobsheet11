import java.util.Scanner;
import java.util.Random;

public class ModifikasiQuiz23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';

        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer == number) {
                    success = true;
                    System.out.println("Selamat! Jawaban Anda benar.");
                } else {
                    System.out.println("Tebakan Anda " + (answer > number ? "terlalu besar" : "terlalu kecil"));
                }

            } while (!success);

            System.out.print("Apakah Anda ingin mengulang permainan (Y/T): ");
            menu = input.next().charAt(0);
            input.nextLine();

        } while (menu == 'Y' || menu == 'y');
    }
}
