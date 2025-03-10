package Tugas2;

public class Clothing extends Product {
    private String ukuran;
    private String material;
    
    public Clothing(String nama, double harga, String deskripsi, String ukuran, String material) {
        super(nama, harga, deskripsi);
        this.ukuran = ukuran;
        this.material = material;
    }
    
    public String getUkuran() {
        return ukuran;
    }
    
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void tryOn() {
        System.out.println("Mencoba " + super.getNama() + " dengan ukuran " + ukuran);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Material: " + material);
    }
}