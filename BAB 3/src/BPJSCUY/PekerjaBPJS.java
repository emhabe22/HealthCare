/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BPJSCUY;

/**
 *
 * @author HAFILLPC
 */
// Class PekerjaBPJS
public class PekerjaBPJS extends PesertaBPJS {
    private String perusahaan;
    private String jabatan;

    // Constructor
    public PekerjaBPJS(String nama, String nik, String alamat, String perusahaan, String jabatan) {
    super(nama, nik, alamat);  // Memanggil konstruktor dari PesertaBPJS
    this.perusahaan = perusahaan;
    this.jabatan = jabatan;
}


    // Getter dan Setter
    public String getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan = perusahaan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    // Override method tampilkanInfo untuk mengembalikan String
    @Override
    public String tampilkanInfo() {
        String info = super.tampilkanInfo();  // Menampilkan info dari class induk
        info += "\nPerusahaan: " + perusahaan;
        info += "\nJabatan: " + jabatan;
        return info;  // Mengembalikan String dengan informasi lengkap
    }
}


