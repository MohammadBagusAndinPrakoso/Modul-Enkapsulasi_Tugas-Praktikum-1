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
public class Bus {
    public double penumpang;
    public double maxpenumpang;
    public double counter;
    
    //Konstrukktor kelas Bus
    public Bus(double maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    //Method mutator untuk menambahkan penumpang
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp >= maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
            counter++;
        }
    }
    
    public void getpenumpang(int password){
        if (password == 24.0){
            System.out.println("Password Benar");
        } else {
            System.out.println("Password Salah");
        }
    }
    
    public double getAverage(){
        return penumpang/counter;
    }
    
    public void cetakPenumpang(){
        System.out.println("Penumpang Bus sekarang adalah " +penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " +maxpenumpang);
    }
}
