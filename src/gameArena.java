// Single-file Game Arena Program using OOP concepts

abstract class Game {
    protected int cost;

    Game(int cost) {
        this.cost = cost;
    }

    abstract void play();
}

class RacingGame extends Game {
    RacingGame() {
        super(50);
    }

    void play() {
        System.out.println("🏎 Racing Game Started");
    }
}

class ShootingGame extends Game {
    ShootingGame() {
        super(70);
    }

    void play() {
        System.out.println("🔫 Shooting Game Started");
    }
}

class VRGame extends Game {
    VRGame() {
        super(100);
    }

    void play() {
        System.out.println("🎮 VR Game Started");
    }
}

class Wallet {
    private int balance;

    Wallet(int balance) {
        this.balance = balance;
    }

    int getBalance() {
        return balance;
    }

    void addMoney(int amount) {
        balance += amount;
        System.out.println("₹" + amount + " added to wallet");
    }

    boolean deductMoney(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("₹" + amount + " deducted");
            return true;
        }
        return false;
    }
}

class Player {
    private String name;
    private Wallet wallet;

    Player(String name, int balance) {
        this.name = name;
        this.wallet = new Wallet(balance);
    }

    void playGame(Game game) {
        System.out.println("\n" + name + " selected a game costing ₹" + game.cost);

        if (wallet.deductMoney(game.cost)) {
            game.play();
        } else {
            System.out.println("Insufficient balance");
            System.out.println("Adding money to wallet...");
            wallet.addMoney(200);
            wallet.deductMoney(game.cost);
            game.play();
        }

        System.out.println("Remaining balance: ₹" + wallet.getBalance());
    }
}

public class gameArena {
    public static void main(String[] args) {

        Player player = new Player("Nabin", 60);

        Game racing = new RacingGame();
        Game shooting = new ShootingGame();
        Game vr = new VRGame();

        player.playGame(racing);
        player.playGame(shooting);
        player.playGame(vr);
    }
}
