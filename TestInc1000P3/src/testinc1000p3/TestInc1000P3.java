/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinc1000p3;

/**
 *
 * @author Francesco
 */
public class TestInc1000P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Inc1000Parte3 t1 = new Inc1000Parte3();
        Inc1000Parte3 t2 = new Inc1000Parte3();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println(Inc1000Parte3.count);
    }

}
