package MyHotel;
import java.util.ArrayList;
/**
 *
 * @author Cynthia
 */
public class Costumer extends User implements Pengguna {
    private ArrayList<Kamar> kamarDipesan;
    
    public Costumer (String namaPengguna, String kataSandi) {
        super (namaPengguna, kataSandi);
        this.kamarDipesan = new ArrayList<>();
    }
    
    @Override
    public void lihatReservasi() {
        if (kamarDipesan.isEmpty()) {
            System.out.println ("Hallo " + getNamaPengguna() + ", Anda belum Memesan Kamar untuk Saat Ini.");
        } else {
            System.out.println ("Hallo " + getNamaPengguna() + ", Anda telah Memesan Kamar berikut :");
            for (Kamar kamar : kamarDipesan) {
                kamar.detailKamar();
            }
        }
    }
    
    @Override
    public void pesanKamar (Kamar kamar) {
        if (kamar.isTersedia()) {
            kamar.pesanKamar();
            kamarDipesan.add(kamar);
            System.out.println ("Hai " + getNamaPengguna() + ", Anda berhasil Memesan Kamar " + kamar.getNomorKamar());
        } else {
            System.out.println ("Hai " + getNamaPengguna() + ", Kamar " + kamar.getNomorKamar() + "tidak tersedia.");
        }
            }
    
    @Override
    public void batalkanReservasi (Kamar kamar) {
        if (kamarDipesan.contains(kamar)) {
            kamar.batalkanReservasi();
            kamarDipesan.remove(kamar);
            System.out.println ("Hai " + getNamaPengguna() + ", Anda berhasil Membatalkan Reservasi.");
        } else {
            System.out.println ("Anda belum Memesan Kamar ini.");
        }
    }
}