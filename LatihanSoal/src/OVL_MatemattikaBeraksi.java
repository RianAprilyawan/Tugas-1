/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class OVL_MatemattikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OverloadingMatematika math = new OverloadingMatematika();
        math.pertambahan(12.5, 28.7, 14.2);
        math.pertambahan(23, 34);
        math.pertambahan(12, 28, 14);
        math.pertambahan(3.4, 4.9);
    } 
}
