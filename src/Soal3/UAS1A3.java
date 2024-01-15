package Soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class UAS1A3 {
    public static void main(String[] args) {
        ArrayList<String> floor1 = new ArrayList<>();
        ArrayList<String> floor2 = new ArrayList<>();
        ArrayList<String> floor3 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Masukkan kapasitas mesin kendaraan (cc): ");
            int engineCapacity = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            String vehicle = "Kendaraan - " + engineCapacity + "cc";

            if (engineCapacity >= 2500) {
                floor1.add(vehicle);
                System.out.println("Kendaraan ditempatkan di Lantai 1");
            } else if (engineCapacity >= 1500 && engineCapacity < 2500) {
                floor2.add(vehicle);
                System.out.println("Kendaraan ditempatkan di Lantai 2");
            } else if (engineCapacity >= 1000 && engineCapacity < 1500) {
                floor3.add(vehicle);
                System.out.println("Kendaraan ditempatkan di Lantai 3");
            } else {
                System.out.println("Kendaraan tidak dapat ditempatkan di tempat parkir.");
            }

            System.out.println("Data Kendaraan di Lantai 1: " + floor1);
            System.out.println("Data Kendaraan di Lantai 2: " + floor2);
            System.out.println("Data Kendaraan di Lantai 3: " + floor3);

            System.out.println("Apakah ada kendaraan lagi? (ya/tidak)");
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("tidak")) {
                break;
            }
        }

        System.out.println("Program selesai. Terima kasih!");
        scanner.close();
    }
}
