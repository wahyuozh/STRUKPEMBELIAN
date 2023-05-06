/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ujian;

/**
 *
 * @author HP
 */
public class Barang {
   private String nama;
   private int harga_satuan;
   private int jumlah;
   
   //constructor
   
   public Barang (String nama, int harga_satuan, int jumlah){
       this.nama = nama;
       this.harga_satuan = harga_satuan;
       this.jumlah = jumlah;     
   }
//   method getter
   public String getNama(){
       return nama;
   }
   public int getHarga_satuan(){
       return harga_satuan;
   }
   public int getJumlah(){
       return jumlah;
   }
//  method setter
   private void setNama (String nama){
       this.nama = nama; 
   }
   private void setHarga_satuan (int harga_satuan){
       this.harga_satuan = harga_satuan; 
   }
   private void setJumlah (int jumlah){
       this.jumlah = jumlah;
   }
    }

            
    
            
  
    


    
