/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class OverloadingMatematika {
    int pertambahan(int a, int b){
        int hasil =  a + b;
        System.out.println("Pertambahan: " + a + " + " + b + " = " + hasil);
        return hasil;
    }
    
    int pengurangan(int a, int b){
        int hasil =  a - b;
        System.out.println("Pengurangan: " + a + " - " + b + " = " + hasil);
        return hasil;
    }
    
    int perkalian(int a, int b){
        int hasil =  a * b;
        System.out.println("Perkalian: " + a + " * " + b + " = " + hasil);
        return hasil;
    }
    
    float pembagian(int a, int b){
        float hasil =  a / b;
        System.out.println("Pembagian: " + a + " : " + b + " = " + hasil);
        return hasil;
    }
    double pertambahan(double a, double b){
        double hasil =  a + b ;
        System.out.println("Pertambahan: " + a + " + " + b + "= " + hasil);
        return hasil;
    }
    
    double pertambahan(double a, double b, double c ){
        double hasil =  a + b + c;
        System.out.println("Pertambahan: " + a + " + " + b + "+"+ c + "= " + hasil);
        return hasil;
    }
    
    
     double pengurangan(double a, double b){
        double hasil =  a - b;
        System.out.println("Pengurangan: " + a + " - " + b + " = " + hasil);
        return hasil;
    }
     double pengurangan(double a, double b, double c){
        double hasil =  a - b - c;
        System.out.println("Pengurangan: " + a + " - " + b + " - " + c +" = " + hasil);
        return hasil;
    }
     
    double perkalian(double a, double b){
        double hasil =  a * b;
        System.out.println("Perkalian: " + a + " * " + b + " = " + hasil);
        return hasil;
    }
    
    double perkalian(double a, double b, double c){
        double hasil =  a * b * c;
        System.out.println("Pembagian: " + a + " * " + b + " * " + c +" = " + hasil);
        return hasil;
    }
    
    double pembagian(double a, double b){
        double hasil =  a / b;
        System.out.println("Pembagian: " + a + " : " + b + " = " + hasil);
        return hasil;
    }
    
    double pembagian(double a, double b, double c){
        double hasil =  a / b;
        System.out.println("Pembagian: " + a + " : " + b + " : " + c + " = " + hasil);
        return hasil;
}
}
 

