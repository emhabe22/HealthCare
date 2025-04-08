/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BPJSCUY;

/**
 *
 * @author HAFILLPC
 */
// Class PensiunanBPJS
public class PensiunanBPJS extends PesertaBPJS {
    private int tahunPensiun;
    private String statusPensiun;

    // Constructor
    public PensiunanBPJS(String nama, String nik, String alamat, int tahunPensiun, String statusPensiun) {
        super(nama, nik, alamat);  // Memanggil konstruktor dari PesertaBPJS
        this.tahunPensiun = tahunPensiun;
        this.statusPensiun = statusPensiun;
    }

    // Getter dan Setter
    public int getTahunPensiun() {
        return tahunPensiun;
    }

    public void setTahunPensiun(int tahunPensiun) {
        this.tahunPensiun = tahunPensiun;
    }

    public String getStatusPensiun() {
        return statusPensiun;
    }

    public void setStatusPensiun(String statusPensiun) {
        this.statusPensiun = statusPensiun;
    }

    // Override method tampilkanInfo untuk mengembalikan String
    @Override
    public String tampilkanInfo() {
        String info = super.tampilkanInfo();  // Menampilkan info dari class induk
        info += "\nTahun Pensiun: " + tahunPensiun;
        info += "\nStatus Pensiun: " + statusPensiun;
        return info;  // Mengembalikan String dengan informasi pensiunan
    }
}


