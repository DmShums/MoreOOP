import java.util.Random;

public class King extends Character{

    private static Random randomGenerator = new Random();

    public King() {
        super(randomGenerator.nextInt(10)+5, randomGenerator.nextInt(10)+5, new NobleKick());
    }

    @Override
    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }
}
