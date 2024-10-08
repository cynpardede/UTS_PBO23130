/*Cynthia Angelina Pardede 
*/
package MyHotel;
import java.util.ArrayList;
/**
 *
 * @author Cynthia
 */
public class Admin extends User implements Pengguna {
    private ArrayList <Kamar> Kamarku;
    public Admin (String namaPengguna, String kataSandi, ArrayList <Kamar> Kamarku) {
        super (namaPengguna, kataSandi);
        this.Kamarku = Kamarku;
    }
   
    @Override
    public void lihatReservasi() {
        System.out.println ("Admin " + getNamaPengguna() + " Melihat Semua Reservasi.");
        for (Kamar kamar : Kamarku) {
            kamar.detailKamar();
        }
    }
    
    @Override
    public void pesanKamar(Kamar kamar) {
        kamar.pesanKamar();
        System.out.println ("Admin memesan Kamar " + kamar.getNomorKamar());
    }
    
    @Override
    public void batalkanReservasi(Kamar kamar) {
        kamar.batalkanReservasi();
        System.out.println ("Admin membatalkan Reservasi untuk Kamar " + kamar.getNomorKamar());
    }
    public void tambahKamar (Kamar kamar) {
        Kamarku.add (kamar);
        System.out.println ("Kamar " + kamar.getNomorKamar() + " telah Ditambahkan.");
    }
    public void lihatKamarTersedia() {
        System.out.println ("Kamar yang tersedia: ");
        for (Kamar kamar : Kamarku) {
            if (kamar.isTersedia()) {
                kamar.detailKamar();
            }
        }
    }   
}