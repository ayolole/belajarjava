public class Transaksi {
    public String idTransaksi;
    public int wakturental;
    public int hargaTotal;

    public Transaksi() {
        this.idTransaksi = "Tidak ada";
        this.wakturental = 0;
        this.hargaTotal = 0;
    };
    Transaksi(String idTransaksi, int wakturental, int hargaTotal) {
        this.idTransaksi = idTransaksi;
        this.wakturental = wakturental;
        this.hargaTotal = hargaTotal;
    }

    public void TampilkanTransaksi() {
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Waktu Rental: " + wakturental);
        System.out.println("Harga Total: " + hargaTotal);
        System.out.println("method TampilkanTransaksi dibuat untuk menampilkan informasi tentang transaksi rental motor,ID transaksi, waktu rental, dan harga total.");
    }

    public void ubahWaktuRental(int wakturental) {
        this.wakturental = wakturental;
        System.out.println("method ubahWaktuRental dibuat untuk mengubah waktu rental motor");
    }

    public void ubahHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
        System.out.println("method ubahHargaTotal dibuat untuk mengubah harga total transaksi rental motor");
    }
}
