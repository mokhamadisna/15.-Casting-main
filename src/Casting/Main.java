/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casting;

public class Main {
    public static void main (String[] args){
        Kucing anggora = new Kucing();
        
        Hewan hewan = anggora;
        hewan = (Hewan) anggora;
        
        Hewan hewan2 = new Kucing();
        ((Kucing) hewan2).meow();
    }    
}
