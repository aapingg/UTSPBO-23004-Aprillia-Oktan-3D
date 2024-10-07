package HotelBeraksi;
import Hotel.Kamar;
import Hotel.Orang;
import Hotel.Admin;
import java.util.Scanner;

public class HotelBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Buat admin
        Admin admin = new Admin("Aping", "A011");

        // Array kamar
        Kamar[] daftarKamar = {
            new Kamar("Standart", "Single Bed", 100000),
            new Kamar("Premium", "Twin Bed", 300000),
            new Kamar("VIP", "Double Bed", 400000)
        };

        // Array untuk menyimpan data customer
        Customer[] daftarCustomer = new Customer[daftarKamar.length];
        int indexCustomer = 0;

        boolean lanjut = true;

        while (lanjut) {
            // Menu utama
            System.out.println("\nLogin sebagai Admin dengan id Admin ada pada line 12");
            System.out.println("\n===== Menu Pemesanan Hotel =====");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Pelayanan Customer");
            System.out.println("3. Keluar");

            System.out.print("Pilih peran: ");
            int pilihanPeran = input.nextInt();

            switch (pilihanPeran) {
                case 1:
                    // Admin Login
                    input.nextLine(); // Clear buffer
                    System.out.print("ID Admin: ");
                    String idAdmin = input.nextLine();
                    if (idAdmin.equals(admin.getId())) {
                        System.out.println("\nLogin Admin Berhasil.");
                        admin.lihatDataPelanggan(daftarCustomer); // Admin melihat data pelanggan
                    } else {
                        System.out.println("ID Admin tidak valid.");
                    }
                    break;

                case 2:
                    // Input data customer
                    input.nextLine(); // Clear buffer
                    System.out.print("Nama Customer: ");
                    String nama = input.nextLine();
                    System.out.print("ID KTP Customer: ");
                    String id = input.nextLine();
                    System.out.print("Jenis Kelamin: ");
                    String jenisKelamin = input.nextLine();
                    System.out.print("No. Handphone: ");
                    String noHp = input.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = input.nextLine();

                    Customer customer = new Customer(nama, id, jenisKelamin, noHp, alamat);

                    // Pilih kamar
                    System.out.println("\nDaftar Kamar: ");
                    for (int i = 0; i < daftarKamar.length; i++) {
                        if (!daftarKamar[i].cekKamarDipesan()) {
                            System.out.println((i + 1) + ". " + daftarKamar[i].getTipe() + " dengan " + daftarKamar[i].getTipeKasur() + " - Rp." + daftarKamar[i].getTarifKamar());
                        } else {
                            System.out.println((i + 1) + ". " + daftarKamar[i].getTipe() + " - Sudah Dipesan");
                        }
                    }

                    System.out.print("Pilih Nomor Kamar: ");
                    int pilihanKamar = input.nextInt();
                    Kamar kamarDipilih = daftarKamar[pilihanKamar - 1];

                    // Cek ketersediaan kamar
                    if (kamarDipilih.cekKamarDipesan()) {
                        System.out.println("Maaf, kamar sudah ditempati.");
                    } else {
                        kamarDipilih.pesanKamar();
                        daftarCustomer[indexCustomer] = customer;
                        indexCustomer++;
                        System.out.println("Kamar berhasil dipesan oleh " + customer.getNama() + "!");
                        System.out.println("\nDetail Pesanan:");
                        System.out.println("Nama Customer: " + customer.getNama());
                        System.out.println("Kamar: " + kamarDipilih.getTipe());
                        System.out.println("Kasur: " + kamarDipilih.getTipeKasur());
                        System.out.println("Tarif: Rp." + kamarDipilih.getTarifKamar());
                    }
                    break;

                case 3:
                    // Keluar dari program
                    lanjut = false;
                    System.out.println("Terima kasih telah menggunakan layanan pemesanan kamar hotel.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        input.close();
    }
}