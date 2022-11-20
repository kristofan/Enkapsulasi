package com.mycompany.ENKAPSULASI;

public class ENKAPSULASI {

    
    public static void main(String[] args) {
        persegi P = new persegi();
        P.setpanjang(7);
        P.setlebar(6);
        
        System.out.println("panjang :"+P.getpanjang());
        System.out.println("lebar :"+P.getlebar());
        System.out.println("luas :"+P.getluas());
        
        
    }
    
}