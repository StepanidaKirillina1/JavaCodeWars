import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FindIntegralTest {

   @Test
    public void testFindIntegral() {
       assertEquals("1x^3", FindIntegral.integrate(3,2));
       assertEquals("2x^6", FindIntegral.integrate(12,5));
       assertEquals("10x^2", FindIntegral.integrate(20,1));
   }
}
