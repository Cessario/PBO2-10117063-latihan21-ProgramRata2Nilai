/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan21.programrata2nilai;

import java.util.Scanner;

/**
 *
 * @author DEADPOOL
 */
public class PBO210117063Latihan21ProgramRata2Nilai {

    /*  Nama : Cessario Sheva Lakita Purwa Adidjaya
        NIM  : 10117063
        Kelas : IF-2
        Deskripsi Program : Menampilkan Program Nilai Rata-Rata
     */
    

    public static void main(String[] args) {
        int BanyakMHS,i=1 , NilaiMHS[];
        double rata2, jumlah = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya Mahasiswa \t: ");
        BanyakMHS = scanner.nextInt();
        NilaiMHS = new int[BanyakMHS];
        
        for (i=1 ; i <= BanyakMHS ; i++){
        System.out.print("Nilai Mahasiswa ke-" +i+":" );
        NilaiMHS[i-1] = scanner.nextInt();
        jumlah = jumlah + NilaiMHS[i-1];
       
        }
        rata2 = jumlah/BanyakMHS;
        
   
        
        
        
        
        
        System.out.println("Maka Rata-Rata Nilainya Adalah " );
    }

}
