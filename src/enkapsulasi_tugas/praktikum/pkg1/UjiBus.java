/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi_tugas.praktikum.pkg1;

/**
 *
 * @author MOKLET1
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek busMii dari kelas Bus
        Bus Bus = new Bus(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakPenumpang();
        
        //Menambahkan penumpang pada busMini
        Bus.addPenumpang(2); //
        //Memanggil method cetak pada kelas Bus
        Bus.cetakPenumpang();
        
        //Menambahkan jumlah penumpang pada busMini
        Bus.addPenumpang(2); //
        Bus.cetakPenumpang();
        
        //Mengurangi jumlah penumpang pada busMini
        Bus.addPenumpang(2); //
        Bus.cetakPenumpang();
        
        //Menambahkan jumlah penumpang pada busMini
        Bus.addPenumpang(2); //
        Bus.cetakPenumpang();
        
        //Rata-rata berat penumpang baru
        System.out.println("Rata-rata berat penumpang baru : " +Bus.getAverage());
    }
    
}
