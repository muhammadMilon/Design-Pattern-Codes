interface BattleNotifier {
    void notify(String message);
}

class ConsoleNotifier implements BattleNotifier {
    public void notify(String message) {
        System.out.println("[Console] " + message);
    }
}

class SoundNotifier implements BattleNotifier {
    public void notify(String message) {
        System.out.println("[Sound] Playing sound: " + message);
    }
}

class VibrationNotifier implements BattleNotifier {
    public void notify(String message) {
        System.out.println("[Vibration] Device vibrates for message: " + message);
    }
}

class GameEventManager {
    private BattleNotifier notifier;

    public GameEventManager(BattleNotifier notifier) {
        this.notifier = notifier;
    }

    // DRY principle: message formatting in one reusable method
    private String formatMessage(String player, String action, int damage) {
        return String.format("Player %s performed %s and dealt %d damage!", player, action, damage);
    }

    public void playerAttack(String player, String action, int damage) {
        String message = formatMessage(player, action, damage);
        notifier.notify(message); // Loose Coupling: can use any notifier
    }
}

public class BattleGameNotification {
    public static void main(String[] args) {
        // Create different notifier types
        BattleNotifier console = new ConsoleNotifier();
        BattleNotifier sound = new SoundNotifier();
        BattleNotifier vibration = new VibrationNotifier();

        // Use each notifier in a different game instance
        GameEventManager game1 = new GameEventManager(console);
        GameEventManager game2 = new GameEventManager(sound);
        GameEventManager game3 = new GameEventManager(vibration);

        // Sample input/output
        game1.playerAttack("Knight", "Slash", 40);
        game2.playerAttack("Wizard", "Fireball", 70);
        game3.playerAttack("Rogue", "Backstab", 55);
    }
}
