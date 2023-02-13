import Heroes.*;

public class Hw1 {
    public static void main(String[] args) {
        Arbalester arbalester = new Arbalester();
        Monk monk = new Monk();
        Peasant peasant = new Peasant();
        Robber robber = new Robber();
        Sniper sniper = new Sniper();
        Spearman spearman = new Spearman();
        Witch witch = new Witch();
        System.out.println(arbalester.getAbout());
        System.out.println(monk.getAbout());
        System.out.println(peasant.getAbout());
        System.out.println(robber.getAbout());
        System.out.println(sniper.getAbout());
        System.out.println(spearman.getAbout());
        System.out.println(witch.getAbout());
    }
}
