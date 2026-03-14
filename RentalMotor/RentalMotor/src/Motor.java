public class Motor {
    public String merk;
    public String tipe;
    public int hargaSewa;

    public Motor() {
        this.merk = "Tidak ada";
        this.tipe = "Tidak ada";
        this.hargaSewa = 0;
    };
    
    Motor(String merk, String tipe, int hargaSewa) {
        this.merk = merk;
        this.tipe = tipe;
        this.hargaSewa = hargaSewa;
    }

    public void display() {
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Harga Sewa: " + hargaSewa);
        System.out.println("Method display dibuat untuk menampilkan informasi tentang motor yang disewa, termasuk merk, tipe, dan harga sewa.\n");
    }

    public void ubahHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
        System.out.println("method ubahHargaSewa dibuat untuk mengubah harga sewa motor\n");
    }
}
