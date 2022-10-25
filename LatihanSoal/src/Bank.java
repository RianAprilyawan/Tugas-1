/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Bank {
    int saldoPribadi;
    int total;
    Bank(int saldo){
        saldoPribadi = saldo;
    }
    void getsaldo(){
        System.out.println("Selamat Datang DiBank JABAR");
        System.out.println("Saldo anda sisa : Rp." + saldoPribadi);
         }
    void simpanUang (int simpan){
        total = simpan + saldoPribadi;
        System.out.println("Simpan uang : " + simpan);
        System.out.println("Saldo anda sisa : Rp." + total);
    }
    void ambilUang (int ambil){
        int jumlah = total - ambil;
        System.out.println("Ambil uang : " + ambil);
         System.out.println("Saldo anda sisa : Rp." + jumlah);
    }
    
        
    }

