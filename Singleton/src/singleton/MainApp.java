/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author yyyura
 */
public class MainApp {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        s1.demoMethod();

    }
}
