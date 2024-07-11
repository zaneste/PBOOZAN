/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pboozan;
import gui.FrameUtama;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import koneksi.*;
import penjualan.barang;
import penjualan.laporan;
import penjualan.operasional;
import penjualan.transaksi;

/**
 *
 * @author ASUS
 */
public class PBOOZAN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        koneksi obj = new koneksi();
        new FrameUtama().setVisible(true);
    }
}  