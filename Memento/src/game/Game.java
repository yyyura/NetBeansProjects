package game;

/**
 *
 * @author yyyura
 */
public class Game { // Originator

    private int score;
    private int time;

    public void play(int score, int time) {
        this.score = score;
        this.time = time;
    }

    public Save save() {// CreateMemento
        return new Save(score, time);
    }

    public void load(Save save) {// SetMemento(Memento m)
        score = save.getScore();
        time = save.getTime();

    }

    @Override
    public String toString() {
        return "Game{" + "score= " + score + ", time= " + time + '}';
    }
}
