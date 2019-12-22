package Labs.Lab2;

/**
 * Startup
 */
public class Startup {
    public static void main(String[] args) {
        TV[] tvs = new TV[4];

        tvs[1] = new TV(); // TV1
        tvs[0] = new TV(); // TV2
        tvs[3] = new TV(); // TV3
        tvs[2] = tvs[1];

        for (TV var : tvs) {
            var.setChannel(1);
        }

        tvs[1].setChannel(2);

        System.out.println(tvs[0]);
        System.out.println(tvs[1]);
        System.out.println(tvs[2]); // Reference type
        System.out.println(tvs[3]);
    }
}