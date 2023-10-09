import java.util.Random;

public class Knight extends Character{
    private static Random randomGenerator = new Random();

    public Knight() {
        super(randomGenerator.nextInt(10)+2, randomGenerator.nextInt(10)+2, new NobleKick());
    }

    @Override
    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }
}

