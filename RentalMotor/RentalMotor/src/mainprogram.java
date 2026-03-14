public class mainprogram {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Melvin Satria Gunanta Sitepu", "9004","0822*****743");//data pribadi untuk Ketentuan tambahan no.4(nama dan awal dan akhir nomor telepon pribadi)
        Motor motor1 = new Motor("Honda", "Beat", 150000);
        Transaksi transaksi1 = new Transaksi("T001", "Kamis 25-08-2025",3);
        System.out.println("Data Rental Motor:");
        customer1.displayCustomer();
        motor1.display();
        transaksi1.denda(2);
        transaksi1.totalHarga(motor1.hargaSewa, transaksi1.wakturental);
        transaksi1.TampilkanTransaksi(customer1.nama);

        System.out.println("\n--------------------Mengubah data transaksi--------------------------\n");
        customer1.ubahnama("Agus Satria Gunanta Sitepu");
        motor1.ubahHargaSewa(200000);
        System.out.println("\n\nData Rental Motor setelah diubah:");
        customer1.displayCustomer();
        motor1.display();
        transaksi1.denda(2);
        transaksi1.totalHarga(motor1.hargaSewa, transaksi1.wakturental);
        transaksi1.TampilkanTransaksi(customer1.nama);
    };
}
