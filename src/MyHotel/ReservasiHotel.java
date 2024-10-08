/*Cynthia Angelina Pardede
NPM = 2310631170130
*/
package MyHotel;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Cynthia
 */
public class ReservasiHotel {
    public static void main(String[] args) {
        String namaHotel = "D'Sinpars Hotel";
        System.out.println ("Welcome to our cherished guests at " + namaHotel + "!");
        ArrayList<Kamar> Kamarku = new ArrayList<>();
        Kamarku.add (new Kamar (111, "Classic", true, 150000));
        Kamarku.add (new Kamar (112, "European Style", true, 250000));
        Kamarku.add (new Kamar (113, "Japanese Style", true, 500000));
        Kamarku.add (new Kamar (114, "Nature theme", true, 2650000));
        Kamarku.add (new Kamar (115, "Most Comfort Aesthetic", true, 3000000));
        
        Costumer costumer = new Costumer ("Bartholomeus", "12345");
        Admin admin = new Admin ("Cynthia", "adminpass", Kamarku);
        int pilihan;
        
        do {
            System.out.println("\n~~~ Silahkan Pilih Menu Hotel kami ~~~");
            System.out.println("\n=== Menu Reservasi D'Sinpars Hotel ===");
            System.out.println("1. Check Kamar yang tersedia");
            System.out.println("2. Booking Kamar");
            System.out.println("3. Lihat Bookingan Anda");
            System.out.println("4. Canceled Booking Kamar");
            System.out.println("5. [Admin] Tambah Kamar");
            System.out.println("6. [Admin] Lihat Semua Kamar");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            Scanner scanner = new Scanner(System.in);
            pilihan = scanner.nextInt();
            
        switch (pilihan) {
            case 1:
                admin.lihatKamarTersedia();
                break;
            case 2:
                System.out.println ("Masukkan Nomor Kamar yang ingin Dipesan: ");
                int nomorKamar = scanner.nextInt();
                Kamar kamarTerpilih = Kamarku.stream()
                        .filter(kamar -> nomorKamar == kamar.getNomorKamar())
                        .findFirst()
                        .orElse(null);
                
                if (kamarTerpilih != null) {
                    costumer.pesanKamar(kamarTerpilih);
                } else {
                    System.out.println ("Kamar tidak Ditemukan.");
                }
                break;
            case 3:
                costumer.lihatReservasi();
            break;
            case 4:
                System.out.println ("Masukkan Nomor Kamar untuk Membatalkan Reservasi: ");
                int nomorKamarBatal = scanner.nextInt();
                Kamar kamarBatal = Kamarku.stream()
                        .filter(kamar -> nomorKamarBatal == kamar.getNomorKamar())
                        .findFirst()
                        .orElse(null);
                if (kamarBatal != null) {
                    costumer.batalkanReservasi(kamarBatal);
                } else {
                    System.out.println ("Kamar Tidak Ditemukan.");
                }
                break;
            case 5: 
                 System.out.print("Masukkan nomor kamar baru: ");
                    int nomorKamarBaru = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Masukkan tipe kamar baru: ");
                    String tipeKamarBaru = scanner.nextLine();
                    System.out.print("Apakah kamar ini tersedia (Ya/Tidak): ");
                    String inputKetersediaan = scanner.nextLine();
                    boolean ketersediaanBaru = inputKetersediaan.equalsIgnoreCase("Ya");
                    System.out.print("Masukkan harga kamar baru: ");
                    double hargaBaru = scanner.nextDouble();

                    Kamar kamarBaru = new Kamar(nomorKamarBaru, tipeKamarBaru, ketersediaanBaru, hargaBaru);
                    admin.tambahKamar(kamarBaru);        
                    break;                
            case 6:
                admin.lihatReservasi();
                break;
            case 0:
                System.out.println ("We are grateful for your visit <3");
                break;
            default:
                System.out.println ("Pilihan tidak valid, Try again!");
                break;         
        }
    } while (pilihan !=0);
        
        
        
    System.out.println ("~~Have a great day! We hope to see you soon at D'Sinpars Hotel!~~");     
    }   
}