/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no.pkg3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author damayanti eka putri
 */
public class No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            List<Mahasiswa> MahasiswaList = new ArrayList<>();
        MahasiswaList.add(new Mahasiswa(2307, "DAMAYANTI EKA PUTRI", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(1212, "CHINTIA PUTRI SEDAYU", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(1009, "MUAMAR", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(3016, "ADITYA RAMDHANI", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(2456, "WILLIAM PRADANA PUTRA", "TIFRM22A", 191122));

        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + MahasiswaList.size());
        MahasiswaList.remove(0);

        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + MahasiswaList.size()); 
         System.out.println("=========== DAMAYANTI EKA PUTRI ===========");
    }

}
  