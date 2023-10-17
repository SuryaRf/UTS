package Jobsheet7_2.UTS;

import java.util.Scanner;

public class HitungIP27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        String namaMhs;
        int jmlPerbaikan = 0;
        double totalNilai = 0.0;
        int totalSKS = 0;
        
        System.out.println("Program Hitung IP");
        System.out.print("Masukan nama: ");
        namaMhs = sc27.nextLine();
        
        String[] namaMatkulArray = new String[100]; // Assuming you won't enter more than 100 courses.
        double[] nilaiArray = new double[100];
        int[] sksArray = new int[100];
        
        int courseCount = 0; // To keep track of the number of courses entered.
        
        do {
            System.out.print("Nama Mata Kuliah: ");
            String namaMatkul = sc27.nextLine();
            namaMatkulArray[courseCount] = namaMatkul;
            
            System.out.print("Nilai (A, B+, B, C+, C, D, E): ");
            String pilNilai = sc27.nextLine();
            
            double nilai = 0.0;
            if (pilNilai.equalsIgnoreCase("A")) {
                nilai = 4.0;
            } else if (pilNilai.equalsIgnoreCase("B+")) {
                nilai = 3.5;
            } // Add other cases for different grades
            
            nilaiArray[courseCount] = nilai;
            
            System.out.print("Masukan Jumlah SKS: ");
            int sks = sc27.nextInt();
            sksArray[courseCount] = sks;
            
            System.out.print("Apakah lanjut input nilai (Y/y)? ");
            sc27.nextLine();
            String yesNo = sc27.nextLine();
            
            if (yesNo.equalsIgnoreCase("n")) {
                break;
            }
            
            courseCount++;
        } while (true); // Continue until 'n' is entered.
        
        // Calculate total SKS and total nilai
        for (int i = 0; i < courseCount; i++) {
            totalSKS += sksArray[i];
            totalNilai += (nilaiArray[i] * sksArray[i]);
            if (nilaiArray[i] == 1.0) {
                jmlPerbaikan++;
            }
        }
        
        // Calculate IP
        double ip = totalNilai / totalSKS;
        
        // Display the results
        System.out.println("----------Hasil Perhitungan IP----------");
        System.out.println("Nama: " + namaMhs);
        System.out.println("Indeks Prestasi (IP): " + ip);
        System.out.println("Jumlah Mata Kuliah: " + courseCount);
        System.out.println("Jumlah SKS: " + totalSKS);
        System.out.println("Jumlah MK yang Harus perbaikan / remidi: " + jmlPerbaikan);
        
        // Display the course names
        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(namaMatkulArray[i]);
        }
    }
}

