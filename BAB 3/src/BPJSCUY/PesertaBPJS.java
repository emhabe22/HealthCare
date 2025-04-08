/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BPJSCUY;

/**
 *
 * @author HAFILLPC
 */
// Class PesertaBPJS
public class PesertaBPJS {
    private String nama;
    private String nik;
    private String alamat;

    // Constructor
    public PesertaBPJS(String nama, String nik, String alamat) {
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method untuk menampilkan informasi peserta
    public String tampilkanInfo() {
        String info = "Nama: " + nama + "\nNIK: " + nik + "\nAlamat: " + alamat;
        System.out.println(info);  // Menampilkan informasi di console
        return info;  // Mengembalikan informasi dalam bentuk String
    }
}

