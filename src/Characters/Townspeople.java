package Characters;
import java.security.SecureRandom;

public class Townspeople extends Character {

    SecureRandom secureRandom = new SecureRandom();
    private final int healAmount = secureRandom.nextInt(30);

    public Townspeople() {
        super("Townspeople", 0);
    }

    public int getHealAmount() {
        return healAmount;
    }


}
