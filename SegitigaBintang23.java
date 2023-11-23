import java.util.Scanner;

public class SegitigaBintang23 {

    public static void main(String[] args) {
        // Input N
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        // Cetak segitiga bintang
        for (int i = n; i > 0; i--) {
            // Cetak bintang sebanyak i kali
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // Tulis baris baru
            System.out.println();
        }
    }
}
