package Jobsheet7_2.UTS;

import java.util.Scanner;

public class HitungIP27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        String namaMhs, namaMatkul, pilNilai, yesNo;
        int sks, jmlPerbaikan = 0;
        double nilai = 0.0, ip = 0.0;

        System.out.println("Program Hitung IP");
        System.out.print("Masukan nama: ");
        namaMhs = sc27.nextLine();
        boolean validation = false;
        do {

            System.out.print("Nama Mata Kuliah: ");
            namaMatkul = sc27.nextLine();
            System.out.print("Nilai (A, B+, B, C+, C, D, E) : ");
            pilNilai = sc27.nextLine();
            System.out.print("Masukan Jumlah SKS: ");
            sks = sc27.nextInt();
            System.out.print("Apakah lanjut input nilai (Y/y)? ");
            sc27.nextLine();
            yesNo = sc27.nextLine();
            if (yesNo.equalsIgnoreCase("y")) {
                continue;
            } else if (yesNo.equalsIgnoreCase("n")) {
                break;
            }

            if (pilNilai.equalsIgnoreCase("A")) {
                nilai = 4.0;
            } else if (pilNilai.equalsIgnoreCase("B+")) {
                nilai = 3.5;
            } else if (pilNilai.equalsIgnoreCase("B")) {
                nilai = 3.0;
            } else if (pilNilai.equalsIgnoreCase("C+")) {
                nilai = 2.5;
            } else if (pilNilai.equalsIgnoreCase("C")) {
                nilai = 2.0;
            } else if (pilNilai.equalsIgnoreCase("D")) {
                nilai = 1.0;
            } else if (pilNilai.equalsIgnoreCase("E")) {
                nilai = 0.0;
            }

            if (pilNilai.equalsIgnoreCase("D")) {
                jmlPerbaikan = +1;
            }
            sks += sks;
            nilai += nilai;

        } while (validation != true);
        
        jmlPerbaikan += jmlPerbaikan;
        sks += sks;
        ip = (nilai * sks) / sks;

        System.out.println("----------Hasil Perhitungan IP----------");
        System.out.println("nama: " + namaMhs);
        System.out.println("Indeks Prestasi (IP) " + ip);
        System.out.println("Jumlah Mata Kuliah: " + namaMatkul);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah MK yang Harus perbaikan / remidi: " + jmlPerbaikan);

    }

}
