package Tugas2;

class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    public Electronics(String nama, double harga, String deskripsi, String brand, int warrantyPeriod) {
        super(nama, harga, deskripsi);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void checkWarranty() {
        if(warrantyPeriod > 0) {
            System.out.println("Status Garansi: Aktif");
            System.out.println("Warranty is active for "+warrantyPeriod+" months.");
        } else {
            System.out.println("Status Garansi: Non-aktif");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: "+brand);
        System.out.println("Periode Garansi: "+warrantyPeriod);
    }
}
