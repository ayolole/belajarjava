public class Customer {
    public String nama;
    public String nik;
    public String telepon;
    

    public Customer() {
        this.nama = "Tidak ada";
        this.nik = "Tidak ada";
        this.telepon = "Tidak ada";
    };

    Customer(String nama, String nik, String telepon) {
        this.nama = nama;
        this.nik = nik;
        this.telepon = telepon;
    }

    public void displayCustomer() {
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Telepon: " + telepon);
        System.out.println("method displayCustomer dibuat untuk menampilkan informasi tentang nama, NIK, dan nomor telepon pelanggan\n");
    }
    public String ubahnama(String nama) {
        this.nama = nama;
        System.out.println("method ubahnama dibuat untuk mengubah nama pelanggan\n");
        return nama;
    }

    public String ubahTelepon(String telepon) {
        this.telepon = telepon;
        System.out.println("method ubahTelepon dibuat untuk mengubah nomor telepon pelanggan\n");
        return telepon;
    }
}