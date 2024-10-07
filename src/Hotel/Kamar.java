package Hotel;

// Kelas Kamar (Polymorphism digunakan untuk tarif kamar)
public class Kamar {
    private String tipe;
    private String tipeKasur;
    private boolean sudahDipesan;
    private int tarifKamar;

    // Konstruktor
    public Kamar(String tipe, String tipeKasur, int tarifKamar) {
        this.tipe = tipe;
        this.tipeKasur = tipeKasur;
        this.tarifKamar = tarifKamar;
        this.sudahDipesan = false;
    }

    // Method untuk menandai kamar
    public void pesanKamar() {
        sudahDipesan = true;
    }

    public boolean cekKamarDipesan() {
        return sudahDipesan;
    }

    public String getTipe() {
        return tipe;
    }

    public String getTipeKasur() {
        return tipeKasur;
    }

    public int getTarifKamar() {
        return tarifKamar;
    }
}