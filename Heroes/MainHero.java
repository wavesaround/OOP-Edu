package Heroes;

import java.util.Random;

public class MainHero {
    protected static Random r;
    protected int hp;
    protected int maxHp;
    protected int runningSpeed;

    static {
        MainHero.r = new Random();
    }

    public MainHero(int hp, int runningSpeed) {
        this.runningSpeed = runningSpeed;
        this.hp = hp;
        this.maxHp = hp;
    }

    public MainHero() {
        this(MainHero.r.nextInt(100, 200),
                MainHero.r.nextInt(10,50));
    }

    public String getAbout() {
        return String.format("Type: %s  Hp: %d  RS: %d",
                this.getClass().getSimpleName(), this.hp, this.runningSpeed);
    }

    public void getHp(int Hp) {
        if (Hp < 0) Hp *= 1;
        if (this.hp + Hp > this.maxHp) this.hp = this.maxHp;
        else this.hp += Hp;
    }

    public void GetDamage (int damage) {
        if (this.hp - damage > 0) this.hp -= damage;
        else this.hp = 0;
    }

    public void Attack (MainHero target) {
        target.GetDamage(MainHero.r.nextInt(10,20));
    }

    public void getRunningSpeed(int getSpeed) {
        if (getSpeed < 0) getSpeed *= 1;
        this.runningSpeed += getSpeed;
    }
}
