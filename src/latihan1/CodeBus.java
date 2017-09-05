/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author SMK TELKOM
 */
public class CodeBus {
    public int penumpang;//public supaya bisa diakses di class lain
    public int maxPenumpang;
    
    public void cetak(){//method cetak
        System.out.println("Penumpang bus sekarang adalah "+ penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+maxPenumpang);
    }
}
