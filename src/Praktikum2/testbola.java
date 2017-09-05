/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author SMK TELKOM
 */
public class testbola {
    
    public static void main(String[] args){
        double jari = 10;
        System.out.println("Jari jari : "+jari);
        bola bunder = new bola();
        bunder.setjari(jari);
        bunder.showd();
        bunder.showl();
        bunder.showv();
    }
}
