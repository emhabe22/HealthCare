/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BPJS;

/**
 *
 * @author HAFILLPC
 */
public class PesertaBPJS {
    String nama;
    String NIK;
    int nomorBPJS;
    
    // Konstruktor dengan parameter
    public PesertaBPJS(String nama, String NIK, int nomorBPJS) {
        this.nama = nama;
        this.NIK = NIK;
        this.nomorBPJS = nomorBPJS;
    }
    
    // Method untuk menampilkan informasi peserta BPJS
    void tampilkanInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("NIK : " + NIK);
        System.out.println("Nomor BPJS : " + nomorBPJS);
    }
    
    public static void main(String[] args) {
        // Memanggil konstruktor dengan parameter
        PesertaBPJS bpjs = new PesertaBPJS("Hafill", "1234", 123456);
        bpjs.tampilkanInfo(); // Menampilkan informasi peserta
    }
}

