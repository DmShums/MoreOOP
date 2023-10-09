package lotr;

import kick.CryKick;

public class Elf extends Character{
    public Elf()
    {
        super(10, 10, new CryKick());
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.power) {
            c.setHp(0);
        } else {
            c.setHp(c.getHp() - 1);
        }
    }
}
