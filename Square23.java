import java.util.Scanner;

public class Square23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menerima input dari keyboard
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        // Perulangan luar untuk mencetak baris
        for (int iOuter = 1; iOuter <= N; iOuter++){
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

