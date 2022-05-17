import org.example.Main;
import org.example.Vlucht;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLandPrijs {

    @Test
    public void testCasus1(){
        double expected = 1089;
        double actual = Main.landPrijs(new Vlucht(500,1,true,true));
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCasus2(){
        double expected = 150;
        double actual = Main.landPrijs(new Vlucht(500,4,false,false));
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCasus3(){
        double expected = 500;
        double actual = Main.landPrijs(new Vlucht(3000,1,false,false));
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCasus4(){
        double expected = 1875.5;
        double actual = Main.landPrijs(new Vlucht(3000,4,true,true));
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCasus5(){
        double expected = 3025;
        double actual = Main.landPrijs(new Vlucht(6000,1,false,true));
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCasus6(){
        double expected = 4550;
        double actual = Main.landPrijs(new Vlucht(6000,4,true,false));
        Assertions.assertEquals(expected, actual, 0.01);
    }
}
