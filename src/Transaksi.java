import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaksi {
    private String namaPelanggan;
    private String noHp;
    private String namaBarang;
    protected double hargaBarang;
    protected int jumlahBeli;
    private String namaSuperMarket = "asvrn market";
    private String alamat;
    private String kodeBarang;
    protected String kasir = "Anies Baswedan";

    Date date = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("E dd/MM/yyyy"); // membuat objek untuk menampilkan tanggal
        SimpleDateFormat jam = new SimpleDateFormat("hh:mm:ss zzzz"); // membuat objek untuk menampilkan jam

    public Transaksi(String namaPelanggan, String noHp, String alamat, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        this.namaPelanggan = namaPelanggan;
        this.noHp = noHp;
        this.alamat = alamat;
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.setJumlahBeli(jumlahBeli);
    }

    public void setJumlahBeli(int jumlahBeli) {
        if (jumlahBeli > 1000) {
            throw new IllegalArgumentException("Jumlah beli tidak boleh lebih dari 1000");
        }
        this.jumlahBeli = jumlahBeli;
    }

    public void tampilkanDetailTransaksi() {
        System.out.println("");
        System.out.println(namaSuperMarket.toUpperCase());
        System.out.println("Tanggal\t\t: " + tanggal.format(date));
        System.out.println("Waktu\t\t: " + jam.format(date));
        System.out.println("=========================");
        System.out.println("DATA PELANGGAN");
        System.out.println("---------------------------");
        System.out.println("Nama Pelanggan\t: " + namaPelanggan);
        System.out.println("No HP\t\t: " + noHp);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("---------------------------");
        System.out.println("Kode barang\t: " + kodeBarang);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Harga Barang\t: " + hargaBarang);
        System.out.println("Jumlah Beli\t: " + jumlahBeli);
    }
}
