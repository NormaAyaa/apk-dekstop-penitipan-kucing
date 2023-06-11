/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author LENOVO9
 */
public class PilihPaket {

    /**
     * @return the paket
     */
    public String getPaket() {
        return paket;
    }

    /**
     * @param paket the paket to set
     */
    public void setPaket(String paket) {
        this.paket = paket;
    }

    /**
     * @return the jenis_makanan
     */
    public String getJenis_makanan() {
        return jenis_makanan;
    }

    /**
     * @param jenis_makanan the jenis_makanan to set
     */
    public void setJenis_makanan(String jenis_makanan) {
        this.jenis_makanan = jenis_makanan;
    }
    
    private String paket;
    private String jenis_makanan;
}
