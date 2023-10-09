import java.util.Random;

public class NobleKick implements KickStrategy {
    private static Random randomGenerator = new Random();

    @Override
    public void kick(Character whoKick, Character opponent) {
        int new_pow = randomGenerator.nextInt(whoKick.getPower());
        opponent.setHp(opponent.getHp() - new_pow);
    }
}
