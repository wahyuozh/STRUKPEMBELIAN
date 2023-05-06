/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ujian;

import java.util.Scanner;
public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Pembeli pembeli = new Pembeli();
    public static void main(String[] args) {
        System.out.println("Program Pembelian Barang");
        System.out.println("--------------------------");
        System.out.print("Nama Pembeli: ");
        String namaPembeli=scanner.nextLine();
        Pembeli pembeli = new Pembeli();
        System.out.print("Jumlah barang yang di beli : ");
        int jumlahBarang = scanner.nextInt();
        scanner.nextLine();
    
        for(int i=0; i<jumlahBarang; i++){
            masukanBarang();
        }
        pembeli.informasiPembelian();
    }
    public static void masukanBarang(){
        System.out.print(" Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Harga Satuan :");
        int harga_satuan=scanner.nextInt();
        System.out.print("jumlah barang: ");
        int jumlahBarang = scanner.nextInt();
        scanner.nextLine();
        
        Barang barang = new Barang (namaBarang, harga_satuan, jumlahBarang);
           pembeli.tambahBarang(barang);
    }
        
    }
    

