package game;

/**
 *
 * @author yyyura
 */
public class Save {// Memento xranitel

    private final int score;
    private final int time;

    public Save(int score, int time) {
        this.score = score;
        this.time = time;
    }

    public int getScore() {
        return score;
    }

    public int getTime() {
        return time;
    }

}
