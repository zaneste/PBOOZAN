/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement; //coding crud
import java.sql.ResultSet;
/**
 *
 * @author ASUS
 */
public class koneksi {
    private String databaseName = "2210020068";
    private String username = "root";
    private String password = "";

    private static Connection koneksi;
    
    public koneksi(){
        try {
            String url = "jdbc:mysql://localhost/"+this.databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(url,this.username,this.password);
            System.out.println("database terkoneksi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanbarang(String idBarang, String jenisBarang, String stokGudang, String barangMasuk, String barangKeluar, String tanggal){
        try {
            String sql = "INSERT INTO barang (idBarang,jenisBarang,stokGudang,barangMasuk,barangKeluar,tanggal) value (?,?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, idBarang );
            perintah.setString(2, jenisBarang);
            perintah.setString(3, stokGudang);
            perintah.setString(4, barangMasuk);
            perintah.setString(5, barangKeluar);
            perintah.setString(6, tanggal );
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
    public void ubahbarang(String idBarang, String jenisBarang, String stokGudang, String barangMasuk, String barangKeluar, String tanggal){
        try {
        String sql = "UPDATE barang (idBarang,jenisBarang,stokGudang,barangMasuk,barangKeluar,tanggal) value (?,?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, idBarang );
            perintah.setString(2, jenisBarang);
            perintah.setString(3, stokGudang);
            perintah.setString(4, barangMasuk);
            perintah.setString(5, barangKeluar);
            perintah.setString(6, tanggal );
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
   public void hapusbarang(Integer idBarang) {
    try {
        String sql = "DELETE FROM barang WHERE idBarang = ?";
        PreparedStatement perintah = koneksi.prepareStatement(sql);
        perintah.setInt(1, idBarang);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Dihapus");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
   
  public void caribarang(Integer idBarang) {
       try {
           String sql ="SELECT * FROM barang WHERE idBarang=? ";
           PreparedStatement perintah = koneksi.prepareStatement(sql);
           perintah.setInt(1, idBarang);
           ResultSet data=perintah.executeQuery();
           while(data.next()) {
            System.out.println(data.getString("idBarang"));
            System.out.println(data.getString("jenisBarang"));
            System.out.println(data.getString("stokGudang"));
            System.out.println(data.getString("barangMasuk"));
            System.out.println(data.getString("barangKeluar"));
            System.out.println(data.getString("tanggal"));
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
  }
        public void simpanlaporan(String idLaporan, String alamatKirim, String deskripsi, String tanggal){
        try {
            String sql = "INSERT INTO laporan (idLaporan, alamatKirim, deskripsi, tanggal) value (?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, idLaporan );
            perintah.setString(2, alamatKirim);
            perintah.setString(3, deskripsi);
            perintah.setString(4, tanggal);
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
    public void ubahlaporan(String idLaporan, String alamatKirim, String deskripsi, String tanggal){
        try {
        String sql = "UPDATE laporan(idLaporan, alamatKirim, deskripsi, tanggal) value (?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, idLaporan );
            perintah.setString(2, alamatKirim);
            perintah.setString(3, deskripsi);
            perintah.setString(4, tanggal);
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
   public void hapuslaporan(Integer idLaporan) {
    try {
        String sql = "DELETE FROM laporan WHERE idLaporan = ?";
        PreparedStatement perintah = koneksi.prepareStatement(sql);
        perintah.setInt(1, idLaporan);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Dihapus");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
   
  public void carilaporan(Integer idLaporan) {
       try {
           String sql ="SELECT * FROM laporan WHERE idLaporan=? ";
           PreparedStatement perintah = koneksi.prepareStatement(sql);
           perintah.setInt(1, idLaporan);
           ResultSet data=perintah.executeQuery();
           while(data.next()) {
            System.out.println(data.getString("idLaporan"));
            System.out.println(data.getString("alamatKirim"));
            System.out.println(data.getString("deskripsi"));
            System.out.println(data.getString("tanggal"));
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
}
  
  public void simpanoperasional(String idTransaksi,  String tanggal, String biayaMobil, String biayaSupir, String totalBiaya){
        try {
            String sql = "INSERT INTO operasional (idTransaksi,  String tanggal, String biayaMobil, String biayaSupir, String totalBiaya) value (?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, idTransaksi );
            perintah.setString(2, tanggal);
            perintah.setString(3, biayaMobil);
            perintah.setString(4, biayaSupir);
            perintah.setString(5, totalBiaya);
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
    public void ubahoperasional(String idTransaksi,  String tanggal, String biayaMobil, String biayaSupir, String totalBiaya){
        try {
        String sql = "UPDATE operasional (idTransaksi,  String tanggal, String biayaMobil, String biayaSupir, String totalBiaya) value (?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, idTransaksi );
            perintah.setString(2, tanggal);
            perintah.setString(3, biayaMobil);
            perintah.setString(4, biayaSupir);
            perintah.setString(5, totalBiaya);
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
   public void hapusoperasional(Integer idTransaksi) {
    try {
        String sql = "DELETE FROM operasional WHERE idTransaksi = ?";
        PreparedStatement perintah = koneksi.prepareStatement(sql);
        perintah.setInt(1, idTransaksi);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Dihapus");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
   
  public void carioperasional(Integer idTransaksi) {
       try {
           String sql ="SELECT * FROM operasional WHERE idTransaksi=? ";
           PreparedStatement perintah = koneksi.prepareStatement(sql);
           perintah.setInt(1, idTransaksi);
           ResultSet data=perintah.executeQuery();
           while(data.next()) {
            System.out.println(data.getString("idTransaksi"));
            System.out.println(data.getString("tanggal"));
            System.out.println(data.getString("biayaMobil"));
            System.out.println(data.getString("biayaSupir"));
            System.out.println(data.getString("totalBiaya"));
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
}
  
  public void simpantransaksi(String idTransaksi, String tanggal, String namaPelanggan, String jenisBarang, String jumlah, String statBayar){
        try {
            String sql = "INSERT INTO transaksi (idTransaksi, tanggal, namaPelanggan, jenisBarang, jumlah, statBayar) value (?,?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, idTransaksi );
            perintah.setString(2, tanggal);
            perintah.setString(3, namaPelanggan);
            perintah.setString(4, jenisBarang);
            perintah.setString(5, jumlah);
            perintah.setString(6, statBayar);
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
    public void ubahtransaksi(String idTransaksi, String tanggal, String namaPelanggan, String jenisBarang, String jumlah, String statBayar){
        try {
        String sql = "UPDATE transaksi (idTransaksi, tanggal, namaPelanggan, jenisBarang, jumlah, statBayar) value (?,?,?,?,?,?)";
            PreparedStatement perintah = koneksi.prepareStatement(sql);
            perintah.setString(1, idTransaksi );
            perintah.setString(2, tanggal);
            perintah.setString(3, namaPelanggan);
            perintah.setString(4, jenisBarang);
            perintah.setString(5, jumlah);
            perintah.setString(6, statBayar);
            perintah.executeUpdate();
            System.out.print("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
   }
    
   public void hapustransaksi(Integer idTransaksi) {
    try {
        String sql = "DELETE FROM transaksi WHERE idTransaksi = ?";
        PreparedStatement perintah = koneksi.prepareStatement(sql);
        perintah.setInt(1, idTransaksi);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Dihapus");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}
   
  public void caritransaksi(Integer idTransaksi) {
       try {
           String sql ="SELECT * FROM transaksi WHERE idTransaksi=? ";
           PreparedStatement perintah = koneksi.prepareStatement(sql);
           perintah.setInt(1, idTransaksi);
           ResultSet data=perintah.executeQuery();
           while(data.next()) {
            System.out.println(data.getString("idTransaksi"));
            System.out.println(data.getString("tanggal"));
            System.out.println(data.getString("namaPelanggan"));
            System.out.println(data.getString("jenisBarang"));
            System.out.println(data.getString("jumlah"));
            System.out.println(data.getString("statBayar"));
           }
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
}
}