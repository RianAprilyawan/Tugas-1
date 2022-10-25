/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Matematika {
    
    int pertambahan (int a,int b){
     int hasil = a + b ;
     System.out.println("pertambahan: " + a + " + " + b + " = " + hasil );
     return hasil;
    }
    int pengurangan (int a,int b){
        int hasil = a - b ;
        System.out.println("pengurangan: "+ a + " - " + b +" = " + hasil);
        return hasil;
    }
    int perkalian (int a,int b){
        int hasil = a * b ;
        System.out.println("perkalian: "+ a + " * " + b +" = " + hasil);
        return hasil;
}
    float pembagian (int a,int b){
        float hasil = a / b ;
        System.out.println("pembagian: "+ a + " : " + b +" = " + hasil);
        return hasil;
        }
}