import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FindIntegralTest {

   @Test
    public void testFindIntegral() {
       assertEquals(FindIntegral.integrate(3,2), "1x^3");
       assertEquals(FindIntegral.integrate(12,5), "2x^6");
       assertEquals(FindIntegral.integrate(20,1), "10x^2");
   }
}
