/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basisdatalanjuut;

/**
 *
 * @author Azzam Wildan
 */
public class Bus {
    private String nopol;
    private String jenisBus;
    private double hargaSewa;
    private int kapasitas;
    private String status;

    // Constructor
    public Bus(String nopol, String jenisBus, double hargaSewa, int kapasitas, String status) {
        this.nopol = nopol;
        this.jenisBus = jenisBus;
        this.hargaSewa = hargaSewa;
        this.kapasitas = kapasitas;
        this.status = status;
    }

    // Getter dan Setter untuk tiap field
    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public String getJenisBus() {
        return jenisBus;
    }

    public void setJenisBus(String jenisBus) {
        this.jenisBus = jenisBus;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

