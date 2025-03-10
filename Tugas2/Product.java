package Tugas2;

class Product{
    private String nama;
    private double harga;
    private String deskripsi;

    public Product(String nama, double harga, String deskripsi) {
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getDeskirpsi() {
        return deskripsi;
    }

    public void displayInfo() {
        System.out.println("Nama: "+nama);
        System.out.println("Harga: "+harga);
        System.out.println("Deskripsi: "+deskripsi);
    }

    public double calculateDiscount(double percentage) {
        return harga * (1.0-percentage);
    }

    public double calculateDiscount() {
        return harga * 0.9;
    }
}