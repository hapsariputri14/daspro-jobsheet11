import java.util.Scanner;

public class SegitigaAngka23 {

    public static void main(String[] args) {
        // Input N
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        // Cetak segitiga angka
        for (int i = 1; i <= n; i++) {
            // Cetak spasi sebanyak (n - i) kali
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Cetak angka dari 1 sampai i
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Tulis baris baru
            System.out.println();
        }
    }
}
