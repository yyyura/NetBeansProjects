/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author yyyura
 */
public class Memento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //igraem
        Game g1 = new Game();
        g1.set("lvl 1", 30);
        System.out.println(g1);

        //sohranjaemsja
        File f1 = new File();
        f1.setSave(g1.save());

        //igraem daljshe
        g1.set("lvl 2", 50);
        System.out.println(g1);

        //obratno zagruzem level 1
        System.out.println("loading...");
        g1.load(f1.getSave());
        System.out.println(g1);

    }

}

class Game { // Originator sozdatel

    private String level;
    private int time;

    public void set(String level, int time) {
        this.level = level;
        this.time = time;
    }

    public Save save() {// CreateMemento
        return new Save(level, time);
    }

    public void load(Save save) {// SetMemento(Memento m)
        level = save.getLevel();
        time = save.getTime();
    }

    @Override
    public String toString() {
        return "Game{" + "level=" + level + ", time=" + time + '}';
    }

}

class Save {// Memento xranitel

    private final String level;
    private final int time;

    public Save(String level, int time) {
        this.level = level;
        this.time = time;
    }

    public String getLevel() {
        return level;
    }

    public int getTime() {
        return time;
    }
}

class File {// Caretaker opekun

    Save save;//ssilka na save

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

}
