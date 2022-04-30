import static org.junit.Assert.*;
import org.junit.*;
public class laundryTester {
    public laundry l;
    public laundry l2;

    @Before
    public void setUp(){
        l = new laundry(500);
    }

    @Test
    public void test1(){
        assertEquals(460, l.getBalance(10));
    }
}
