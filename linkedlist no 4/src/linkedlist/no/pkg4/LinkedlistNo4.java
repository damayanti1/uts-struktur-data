/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist.no.pkg4;

import java.util.Scanner;

/**
 *
 * @author damayanti eka putri
 */
public class LinkedlistNo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String id, name, kelas, tglMasuk, def="Masukan ";

        System.out.println("|              Data Mahasiswa             |");
        System.out.println("===========================================");

        System.out.print(def + "ID \t\t: " );
        id = scan.nextLine(); //memberikan nilai variabel dg menyimpan inputan dari user

        System.out.print(def + "NAMA \t: " );
        name = scan.nextLine();

        System.out.print(def + "KELAS \t: " );
        kelas = scan.nextLine();

        System.out.print(def + "TANGGAL MASUK \t\t: " );
        tglMasuk = scan.nextLine();

        System.out.println("");

        // Tampilkan datanya
        System.out.println("+------------------------------------------+");
        System.out.println("|          Data Biodata Mahasiswa          |");
        System.out.println("+------------------------------------------+");
        System.out.println("| ID\t\t\t: " + id);
        System.out.println("| NAME\t\t\t: " + name);
        System.out.println("| KELAS\t\t\t: " + kelas);
        System.out.println("| TANGGAL MASUK\t: " + tglMasuk);
        System.out.println("+------------------------------------------+");
        System.out.println("=========== DAMAYANTI EKA PUTRI ===========");
    }
}
    