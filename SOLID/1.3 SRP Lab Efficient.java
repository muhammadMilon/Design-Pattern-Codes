class Player {
    private int x;
    private int y;

    public Player() {
        this.x = 0;
        this.y = 0;
    }

    public void move(String direction, int boardSize) {
        if (direction.equalsIgnoreCase("UP")) {
            if (y > 0) y--;
        } else if (direction.equalsIgnoreCase("DOWN")) {
            if (y < boardSize - 1) y++;
        } else if (direction.equalsIgnoreCase("LEFT")) {
            if (x > 0) x--;
        } else if (direction.equalsIgnoreCase("RIGHT")) {
            if (x < boardSize - 1) x++;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class ScoreManager {
    private int score;

    public ScoreManager() {
        this.score = 0;
    }

    public void increaseScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }
}

class GameDisplay {
    public void printGameStatus(Player player, ScoreManager scoreManager) {
        System.out.println("Player Position: (" + player.getX() + ", " + player.getY() + ")");
        System.out.println("Current Score: " + scoreManager.getScore());
    }
}

public class GameManager {
    private Player player;
    private ScoreManager scoreManager;
    private int boardSize;
    private GameDisplay display;

    public GameManager(int boardSize) {
        this.player = new Player();
        this.scoreManager = new ScoreManager();
        this.boardSize = boardSize;
        this.display = new GameDisplay();
    }

    public void movePlayer(String direction) {
        player.move(direction, boardSize);
        scoreManager.increaseScore(10);
        System.out.println("Player moved " + direction);
    }

    public void printGameStatus() {
        display.printGameStatus(player, scoreManager);
    }

    public static void main(String[] args) {
        GameManager gameManager = new GameManager(5);
        gameManager.movePlayer("RIGHT");
        gameManager.movePlayer("DOWN");
        gameManager.movePlayer("LEFT");
        gameManager.movePlayer("UP");
        gameManager.printGameStatus();
    }
}
