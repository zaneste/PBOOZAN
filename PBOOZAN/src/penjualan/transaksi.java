/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author ASUS
 */
public class transaksi {
    private int idTransaksi;
    private String tanggal;
    private String namaPelanggan;
    private String jenisBarang;
    private int jumlah;
    private String statBayar;

    public int getIdTransaksi() { return idTransaksi; }
    public void setIdTransaksi(int idTransaksi) { this.idTransaksi = idTransaksi; }

    public String getTanggal() { return tanggal; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }

    public String getNamaPelanggan() { return namaPelanggan; }
    public void setNamaPelanggan(String namaPelanggan) { this.namaPelanggan = namaPelanggan; }

    public String getJenisBarang() { return jenisBarang; }
    public void setJenisBarang(String jenisBarang) { this.jenisBarang = jenisBarang; }

    public int getJumlah() { return jumlah; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }

    public String getStatBayar() { return statBayar; }
    public void setStatBayar(String statBayar) { this.statBayar = statBayar; }

}