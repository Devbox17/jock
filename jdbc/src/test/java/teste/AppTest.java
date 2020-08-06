package teste;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public static void main(String[] args) {
        App a = new App();

        System.out.println(a.soma(2, 3));

        na();
    }

    @Test
    public static void na() {
        App b = new App();

        System.out.println(b.sub(3,2));
    }
}
