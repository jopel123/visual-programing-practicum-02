// 12S23036 - Jopel Simarmata
import java.util.*;
import java.lang.Math;

class P02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String teks, nIM, studi, nama, tanggaljam, dosen, ket, status;
        int prioritas, tingkatkesulitan, harideadline;

        teks = input.nextLine();
        nIM = input.nextLine();
        studi = input.nextLine();
        dosen = input.nextLine();
        tanggaljam = input.nextLine();
        nama = input.nextLine();
        tingkatkesulitan = input.nextInt();
        harideadline = input.nextInt();
        status = input.nextLine();
        prioritas = (int) (tingkatkesulitan * (1.0 / harideadline));
        if (prioritas > 3) {
            ket = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas <= 3 && prioritas > 1.5) {
                ket = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    ket = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("Prioritas : " + prioritas);
        System.out.println("" + teks + "|" + nIM + "|" + studi + "|" + dosen + "|" + tanggaljam + "|" + nama + "|" + status + "|" + ket);
    }
}
