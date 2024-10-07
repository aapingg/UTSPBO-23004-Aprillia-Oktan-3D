package HotelBeraksi;
import Hotel.Orang;

// Class Customer
public class Customer implements Orang {
    private String nama;
    private String id;
    private String jenisKelamin;
    private String noHp;
    private String alamat;

    // Konstruktor
    public Customer(String nama, String id, String jenisKelamin, String noHp, String alamat) {
        this.nama = nama;
        this.id = id;
        this.jenisKelamin = jenisKelamin;
        this.noHp = noHp;
        this.alamat = alamat;
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

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getAlamat() {
        return alamat;
    }
}