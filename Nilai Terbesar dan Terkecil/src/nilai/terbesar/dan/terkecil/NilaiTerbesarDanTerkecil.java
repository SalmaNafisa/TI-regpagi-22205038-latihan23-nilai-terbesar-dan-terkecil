package nilai.terbesar.dan.terkecil;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====Program Terbesar dan Terkecil Nilai Mahasiswa=====");
        
        // menerima input nama petugas
        System.out.println("Masukkan Nama Petugas: ");
        String namaPetugas = input.nextLine();
        // Menerima input jumlah nilai
        System.out.print("Masukkan jumlah nilai: ");
        int n = input.nextInt();

        // Mendeklarasikan array untuk menyimpan nilai
        int[] nilai = new int[n];

        // Menerima input nilai
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Mencari nilai terbesar
        int nilaiTerbesar = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > nilaiTerbesar) {
                nilaiTerbesar = nilai[i];
            }
        }

        // Mencari nilai terkecil
        int nilaiTerkecil = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] < nilaiTerkecil) {
                nilaiTerkecil = nilai[i];
            }
        }

        // Menampilkan hasil
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        System.out.println("nama Petugas: " + namaPetugas);
        System.out.println("Nilai terbesar: " + nilaiTerbesar);
        System.out.println("Nilai terkecil: " + nilaiTerkecil);
    }
    
}
