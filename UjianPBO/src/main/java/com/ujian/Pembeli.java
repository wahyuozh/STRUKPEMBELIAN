/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ujian;
import java.util.ArrayList;
import java.util.List;
public class Pembeli {
    private String nama;
    private List<Barang> daftarBarang = new ArrayList<>();
    
//    Method 
    public void tambahBarang (Barang barang){
        this.daftarBarang.add(barang);
    }
    
//    total harga
   public int totalHargaPembelian(){
       int totalHarga = 0;
       for (Barang barang : daftarBarang){
           totalHarga += ( barang.getJumlah() * barang.getHarga_satuan());
       }
       return totalHarga;
   }
//   informasi pembelian
   public void informasiPembelian(){
       System.out.println("Informasi Pembelian ");
       System.out.println("Nama Pembeli : " +nama);
       System.out.println("Daftar Barang : ");
       daftarBarang.forEach(barang->{;
           System.out.println("- "+barang.getNama()+ "(" + barang.getJumlah()+")" + "Harga Satuan: " + barang.getHarga_satuan());
       });
       System.out.println("Total Harga: " +totalHargaPembelian());
       }
       
}

   
    


    
    
   
    
    

