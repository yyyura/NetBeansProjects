/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author yyyura
 */
public class Controller {

    public static void main(String[] args) {
        // TODO code application logic here

        //igraem
        Game g1 = new Game();
        g1.play(325, 10);
        System.out.println(g1);

        //saving sohranjaemsja
        File f1 = new File();
        f1.setSave(g1.save());

        //igraem daljshe
        g1.play(200, 30);
        System.out.println(g1);

        //return back .obratno zagruzem 
        System.out.println("loading...");
        g1.load(f1.getSave());
        System.out.println(g1);

    }

}
