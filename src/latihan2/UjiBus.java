/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author SMK TELKOM
 */
public class UjiBus {
    public static void main(String[] args){
    
        //membuat objek busBesar dari kelas Bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        //penambahan penumpang

        busBesar.addPenumpang(15);//tambah 15p
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5);//tambah 5p
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26);//tambah 26
        busBesar.cetak();
    }
}
