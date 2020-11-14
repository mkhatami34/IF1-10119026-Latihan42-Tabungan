/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menampilkan tabungan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(input.nextInt());
        
        System.out.println("Jumlah uang yang diambil : ");
        System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(input.nextInt()));
    }
    
}
