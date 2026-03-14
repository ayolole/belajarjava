public class Transaksi {
    public String idTransaksi;
    public String tanggalTransaksi;
    public int batasRental;
    int wakturental;
    int hargaTotal;
    int totaldenda;
    public Transaksi() {
        this.idTransaksi = "Tidak ada";
        this.wakturental = 0;
        this.batasRental = 0;
    };
    Transaksi(String idTransaksi, String tanggalTransaksi, int batasRental) {
        this.idTransaksi = idTransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
        this.batasRental = batasRental;
    }

    public void denda(int wakturental) {
        if (wakturental > batasRental) {
            totaldenda = (wakturental - batasRental) * 50000; // Contoh perhitungan denda
            System.out.println("Denda: " + totaldenda);
            System.out.println("method denda dibuat untuk menghitung dan menampilkan denda jika waktu rental melebihi lama rental yang disepakati.\n");
        } else {
            System.out.println("Tidak ada denda. Waktu rental sesuai dengan lama rental yang disepakati.\n");
        }
    }
    
    public void totalHarga(int hargaSewa, int wakturental) {

        hargaTotal = hargaSewa * batasRental + totaldenda;
        System.out.println("method totalHarga dibuat untuk menghitung total harga berdasarkan harga sewa dan waktu rental.\n");
    }
    public void TampilkanTransaksi(String namaCustomer) {
        System.out.println("Nama Customer: " + namaCustomer);
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Tanggal Transaksi: " + tanggalTransaksi);
        System.out.println("Lama Rental: " + batasRental);
        System.out.println("Harga Total: " + hargaTotal);
        System.out.println("method TampilkanTransaksi dibuat untuk menampilkan informasi tentang transaksi rental motor,ID transaksi, waktu rental, dan harga total.\n");
    }
}