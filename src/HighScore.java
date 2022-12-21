public class HighScore {
    private int score;
    private String name;

    public HighScore(String name, int score ) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
