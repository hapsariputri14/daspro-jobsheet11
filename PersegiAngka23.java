import java.util.Scanner;

public class PersegiAngka23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            cetakPersegiAngka(n);
        }
    }

    static void cetakPersegiAngka(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
