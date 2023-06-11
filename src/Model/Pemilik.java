package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEGION
 */
public class Pemilik {

    /**
     * @return the nik
     */
    public Integer getnik() {
        return nik;
    }

    /**
     * @param nik the nik to set
     */
    public void setnik(Integer nik) {
        this.nik = nik;
    }

    /**
     * @return the nama_pemilik
     */
    public String getnama_pemilik() {
        return nama_pemilik;
    }

    /**
     * @param nama_pemilik the nama_pemilik to set
     */
    public void setNama_pemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the no_telpon
     */
    public Integer getNo_telpon() {
        return no_tlp;
    }

    /**
     * @param no_telpon the no_telpon to set
     */
    public void setNo_telpon(Integer no_tlp) {
        this.no_tlp = no_tlp;
    }
    
    /**
     * @return the nama_kucing
     */
    public String getNama_kucing() {
        return nama_kucing;
    }

    /**
     * @param nama_kucing the nama_kucing to set
     */
    public void setNama_kucing(String nama_kucing) {
        this.nama_kucing = nama_kucing;
    }
    
    private Integer nik;
    private String nama_pemilik;
    private String alamat;
    private String nama_kucing;
    private Integer no_tlp;

    
}
