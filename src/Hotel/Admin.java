package Hotel;
import HotelBeraksi.Customer;

// Class Admin
public class Admin implements Orang {
    private String nama;
    private String id;

    // Konstruktor
    public Admin(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    // Getter dan Setter
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getId() {
        return id;
    }

    // Method untuk melihat data reservasi pelanggan
    public void lihatDataPelanggan(Customer[] daftarCustomer) {
        System.out.println("\nData Pelanggan yang telah memesan kamar:");
        for (Customer customer : daftarCustomer) {
            if (customer != null) {
                System.out.println("Nama: " + customer.getNama() + ", ID: " + customer.getId() +
                        ", Jenis Kelamin: " + customer.getJenisKelamin() + ", No. HP: " + customer.getNoHp() +
                        ", Alamat: " + customer.getAlamat());
            }
        }
    }
}