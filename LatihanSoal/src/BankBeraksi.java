/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank saldo = new Bank (100000);
        saldo.getsaldo();
        saldo.simpanUang(500000);
        saldo.ambilUang(150000);
    }
    
}
