import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Setter;
//import lombok.ToString;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    @Getter
    protected int hp;
    @Getter
    protected int power;
    protected KickStrategy kickStrategy;

    public void kick(Character opponent) {
        kickStrategy.kick(this, opponent);
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
