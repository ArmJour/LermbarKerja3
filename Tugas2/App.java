package Tugas2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while(choice != 4) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Input Book");
            System.out.println("2. Input Electronics");
            System.out.println("3. Input Clothing");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Nama: "); String namaBook = sc.nextLine();
                    System.out.print("Harga: "); double hargaBook = sc.nextDouble(); 
                    sc.nextLine();
                    System.out.print("Deskripsi: "); String deskripsiBook = sc.nextLine();
                    System.out.print("Author: "); String author = sc.nextLine();
                    System.out.print("Halaman: "); int halaman = sc.nextInt(); sc.nextLine();
                    System.out.println();
                    Book book = new Book(namaBook, hargaBook, deskripsiBook, author, halaman);
                    System.out.println("Displaying Product Information:");
                    book.displayInfo();

                    System.out.println("Calculating Discount (Default 10%): ");
                    System.out.println("Discounted Price: "+book.calculateDiscount());

                    System.out.println("Calculating Discount (Default 20%): ");
                    System.out.println("Discounted Price: "+book.calculateDiscount(0.2));
                    book.readSynopsis();
                }
                case 2 -> {
                    System.out.print("Nama: "); String namaE = sc.nextLine();
                    System.out.print("Harga: "); double hargaE = sc.nextDouble(); 
                    sc.nextLine();
                    System.out.print("Deskripsi: "); String deskripsiE = sc.nextLine();
                    System.out.print("Brand: "); String brand = sc.nextLine();
                    System.out.print("Warranty Period: "); int warrantyPeriod = sc.nextInt(); sc.nextLine();
                    System.out.println();
                    Electronics ele = new Electronics(namaE, hargaE, deskripsiE, brand, warrantyPeriod);
                    System.out.println("Displaying Product Information:");
                    ele.displayInfo();
                    ele.checkWarranty();
                }
                case 3 -> {
                    System.out.print("Nama: "); String namaC = sc.nextLine();
                    System.out.print("Harga: "); double hargaC = sc.nextDouble(); 
                    sc.nextLine();
                    System.out.print("Deskripsi: "); String deskripsiC = sc.nextLine();
                    System.out.print("Ukuran: "); String ukuran = sc.nextLine();
                    System.out.print("Material: "); String material = sc.nextLine();
                    System.out.println();
                    Clothing baju = new Clothing(namaC, hargaC, deskripsiC, ukuran, material);
                    System.out.println("Displaying Product Information:");
                    baju.displayInfo();
                    baju.tryOn();
                }
                case 4 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
