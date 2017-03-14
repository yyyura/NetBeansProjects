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
public class Singleton {

    //static member
    private static Singleton instance;

    //private constructor	
    private Singleton() {
    }

    //staic method
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /* Other methods protected by singleton-ness */
    protected static void demoMethod() {
        System.out.println("demoMethod for singleton");

    }
}
