
import java.util.*

 /*
 **
 *
 Syahrul Yusman
 **
 */

public class NIMRun {
    public static void main(String[] args) {

        String nimScan;
        nimScan = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM  : ");
        nimScan = scan.nextLine();

        NIM nim = new NIM(nimScan);

        System.out.println("\nJenjang Pendidikan\t\t: " + nim.jenjangPendidikan());
        System.out.println("Angkatan\t\t\t\t: " + nim.angkatan());
        System.out.println("Fakultas\t\t\t\t: " + nim.fakultas());
        System.out.println("Prodi\t\t\t\t\t: " + nim.prodi());
        System.out.println("Jenis Kelamin\t\t\t: " + nim.jenisKelamin());
        System.out.println("Nomor Urut Mahasiswa\t: " + nim.noUM());
    }
}