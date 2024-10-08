package MyHotel;

/**
 *
 * @author Cynthia
 */
public class Kamar {
    private int nomorKamar;
    private String tipeKamar;
    private double harga;
    private boolean tersedia;
    
    public Kamar (int nomorKamar, String tipeKamar, boolean tersedia, double harga) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.harga = harga;
        this.tersedia = tersedia;
    }
    
    public int getNomorKamar() {
        return nomorKamar;
    }
    public boolean isTersedia() {
        return tersedia;
    }
    public void pesanKamar() {
        if (tersedia) {
            tersedia = false;
        }
    }
    public void batalkanReservasi() {
        tersedia = true;
    }
    public void detailKamar() {
        System.out.println ("Nomor Kamar: " + nomorKamar + ", Tipe: " + tipeKamar + ", Harga: Rp " + harga);
    }
}