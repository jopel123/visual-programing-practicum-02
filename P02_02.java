//12S23036 - Jopel Simarmata
import java.util.*;
import java.lang.Math;

class P02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, aC, lantai, ketersediaan, status;
        int kapasitas, jumlah, skor;

        nama = input.nextLine();
        kapasitas = input.nextInt();
        jumlah = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaan = input.nextLine();
        skor = (int) ((double) jumlah / kapasitas * 100);
        if (skor >= 40) {
            status = "Gudang Elite";
        } else {
            if (skor >= 25) {
                status = "Gudang Standar";
            } else {
                if (skor < 25) {
                    status = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println("Informasi Gudang :");
        System.out.println(nama + "|" + kapasitas + "|" + jumlah + "|" + aC + "|" + lantai + "|" + ketersediaan + "|" + skor + "|" + status);
    }
}
