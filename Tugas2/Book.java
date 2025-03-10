package Tugas2;

public class Book extends Product {
    private String author;
    private int halaman;
    
    public Book(String nama, double harga, String deskripsi, String author, int halaman) {
        super(nama, harga, deskripsi);
        this.author = author;
        this.halaman = halaman;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public int getHalaman() {
        return halaman;
    }
    
    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }
    
    public void readSynopsis() {
        System.out.println("Membaca sinopsis dari " + super.getNama() + " by " + author);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
        System.out.println("Pages: " + halaman);
    }
    
}