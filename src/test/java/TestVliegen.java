import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestVliegen {

    /**
     * Modified Condition/Decision Coverage
     */
    @Test
    public void test101(){
        boolean toestemming = true;
        int gewicht = 1500;
        int tegenwind = 60;
        boolean actual = Main.magVliegen(toestemming, gewicht, tegenwind);
        Assertions.assertTrue(actual);
    }

    @Test
    public void test001(){
        boolean toestemming = false;
        int gewicht = 1500;
        int tegenwind = 60;
        boolean actual = Main.magVliegen(toestemming, gewicht, tegenwind);
        Assertions.assertFalse(actual);
    }

    @Test
    public void test110(){
        boolean toestemming = true;
        int gewicht = 50;
        int tegenwind = 10;
        boolean actual = Main.magVliegen(toestemming, gewicht, tegenwind);
        Assertions.assertTrue(actual);
    }

    @Test
    public void test100(){
        boolean toestemming = true;
        int gewicht = 1500;
        int tegenwind = 10;
        boolean actual = Main.magVliegen(toestemming, gewicht, tegenwind);
        Assertions.assertFalse(actual);
    }


}
