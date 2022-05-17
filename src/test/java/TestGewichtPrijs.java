import org.example.Main;
import org.example.Vlucht;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGewichtPrijs {

    @Test
    public void test0(){
        Vlucht vlucht = new Vlucht(0,0,false,false);
        int expected = 100;
        int actual = Main.gewichtPrijs(vlucht);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test500(){
        Vlucht vlucht = new Vlucht(500,0,false,false);
        int expected = 100;
        int actual = Main.gewichtPrijs(vlucht);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test999(){
        Vlucht vlucht = new Vlucht(999,0,false,false);
        int expected = 100;
        int actual = Main.gewichtPrijs(vlucht);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test1000(){
        Vlucht vlucht = new Vlucht(1000,0,false,false);
        int expected = 500;
        int actual = Main.gewichtPrijs(vlucht);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test1001(){
        Vlucht vlucht = new Vlucht(1001,0,false,false);
        int expected = 500;
        int actual = Main.gewichtPrijs(vlucht);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4999(){
        Vlucht vlucht = new Vlucht(4999,0,false,false);
        int expected = 500;
        int actual = Main.gewichtPrijs(vlucht);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5000(){
        Vlucht vlucht = new Vlucht(5000,0,false,false);
        int expected = 2500;
        int actual = Main.gewichtPrijs(vlucht);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5001(){
        Vlucht vlucht = new Vlucht(5001,0,false,false);
        int expected = 2500;
        int actual = Main.gewichtPrijs(vlucht);
        Assertions.assertEquals(expected, actual);
    }
}
