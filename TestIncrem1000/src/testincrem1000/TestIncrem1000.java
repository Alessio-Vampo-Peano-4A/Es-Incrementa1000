/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testincrem1000;

/**
 *
 * @author Francesco
 */
public class TestIncrem1000 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws InterruptedException {
        Inc1000 inc1 = new Inc1000();
        Inc1000 inc2 = new Inc1000();
        inc1.start();      
        inc2.start();
        inc1.join();
        inc2.join();
        System.out.println(Inc1000.cont);
    }
    
}
