import java.util.ArrayList;
import java.util.Date;

public class customerhotell {
      private String noKtp;
    private String nama;
    private String alamat;
    private String nomorKamar;
    private Date waktuCheckin;
    private Date waktuCheckout;
    private ArrayList<String> pesananMakanan;

    public customerhotell(String noKtp, String nama, String alamat, String nomorKamar) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorKamar = nomorKamar;
        this.waktuCheckin = new Date(); // Set waktu check-in saat objek dibuat
        this.pesananMakanan = new ArrayList<>();
    }

    public void tambahPesananMakanan(String pesanan) {
        pesananMakanan.add(pesanan);
    }

    public void informasiPembayaran(double totalBiaya) {
        System.out.println("Informasi Pembayaran:");
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Total Biaya: $" + totalBiaya);
    }

    public void infoTamu() {
        System.out.println("Informasi Tamu:");
        System.out.println("No. KTP: " + noKtp);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Waktu Check-in: " + waktuCheckin);
        System.out.println("Waktu Check-out: " + waktuCheckout);
    }

    public Date getWaktuCheckout() {
        return waktuCheckout;
    }

    public void setWaktuCheckout(Date waktuCheckout) {
        this.waktuCheckout = waktuCheckout;
    }

    public static void main(String[] args) {
        customerhotell customer = new customerhotell("1406032012030004", "Putra Raimar Delvin", "jl.Mesan, Sleman, Yogyakarta", "E101");

        customer.tambahPesananMakanan("Ayam Balado");
        customer.tambahPesananMakanan("Es Jeruk");

        customer.infoTamu();
        System.out.println("Pesanan Makanan: " + customer.pesananMakanan);

        // Simulasi waktu check-out
        Date waktuCheckout = new Date();
        customer.setWaktuCheckout(waktuCheckout);

        double totalBiaya = 50.000; // Contoh total biaya
        customer.informasiPembayaran(totalBiaya);
    }
}
