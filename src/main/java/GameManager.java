public class GameManager {

    public void fight(Character c1, Character c2) {
        System.out.println("Fight started between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName());

        while (c1.isAlive() && c2.isAlive()) {
            // Character 1 attacks Character 2
            int damage1 = calculateDamage(c1, c2);
            c2.setHp(c2.getHp() - damage1);
            System.out.println(c1.getClass().getSimpleName() + " attacks " + c2.getClass().getSimpleName() + " for " + damage1 + " damage.");

            // Check if Character 2 is still alive
            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " is defeated.");
                break; // Character 2 is defeated, exit the loop
            }

            // Character 2 attacks Character 1
            int damage2 = calculateDamage(c2, c1);
            c1.setHp(c1.getHp() - damage2);
            System.out.println(c2.getClass().getSimpleName() + " attacks " + c1.getClass().getSimpleName() + " for " + damage2 + " damage.");

            // Check if Character 1 is still alive
            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " is defeated.");
                break; // Character 1 is defeated, exit the loop
            }
        }

        System.out.println("Fight ended.");
    }

    private int calculateDamage(Character attacker, Character defender) {
        // You can implement your own logic to calculate damage here
        // For simplicity, let's assume damage is based on attacker's power
        return attacker.getPower();
    }
}
