import static org.junit.Assert.*;
import org.junit.*;
public class laundryTester {
    public laundry l;

    @Before
    public void setUp(){
        l = new laundry(500);
    }
    
    public void none(){}

    @Test
    public void test1(){
        assertEquals(470, l.getBalance(10));
    }
}
