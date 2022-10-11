/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.demoapp;

/**
 *
 * @author nicolaus
 */
public class DemoApp{
    
    public static void main(String[] args){
        int jmlh_looping = 5;
        int bil1 = 5;
        int bil2 = 2;
        
        DemoObjectOriented demo = new DemoObjectOriented();
        demo.helloworld(jmlh_looping);
        System.out.println("-Pemanggilan Fungsi Tambah-");
        System.out.println("Hasil OPerasi Tambah" + demo.tambah (bil1, bil2));
        
    }
}
    