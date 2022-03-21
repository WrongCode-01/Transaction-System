/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

/**
 *
 * @author user
 */
public class ModelBarang {
    private String namaBarang;
    private String satuan;
    private double harga;

    public ModelBarang(String namaBarang, String satuan, double harga) {
        this.namaBarang = namaBarang;
        this.satuan = satuan;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return this.namaBarang;
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the satuan
     */
    public String getSatuan() {
        return satuan;
    }

    /**
     * @param satuan the satuan to set
     */
    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
