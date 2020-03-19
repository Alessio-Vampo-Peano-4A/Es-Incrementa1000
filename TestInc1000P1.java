/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinc1000p1;

/**
 *
 * @author Francesco
 */
public class TestInc1000P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inc1000Parte1 t1 = new Inc1000Parte1();
        Inc1000Parte1 t2 = new Inc1000Parte1();
        t1.start();
        t2.start();
        System.out.println(Inc1000Parte1.count);
    }
}
