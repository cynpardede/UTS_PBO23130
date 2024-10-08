package MyHotel;

/**
 *
 * @author Cynthia
 */
abstract class User {
    private String namaPengguna;
    private String kataSandi;
    
    public User (String namaPengguna, String kataSandi) {
        this.namaPengguna = namaPengguna;
        this.kataSandi = kataSandi;
    }
    
    public String getNamaPengguna() {
        return namaPengguna;
    }
}
