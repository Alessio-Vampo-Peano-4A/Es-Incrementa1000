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
public class Inc1000Parte3 extends Thread {

    static int count;

    synchronized void Inc1000() {
        count++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Inc1000();
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {

            }
        }
    }
}
