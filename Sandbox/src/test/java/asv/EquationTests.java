package asv;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTests {

  @Test
  public void test0 () {
    asv.Equation e = new asv.Equation(1, 1, 1);
    Assert.assertEquals(e.rootNumber(), 0);
  }

  @Test
  public void test1 () {
    asv.Equation e = new asv.Equation(1, 2, 1);
    Assert.assertEquals(e.rootNumber(), 1);
  }

  @Test
  public void test2 () {
    asv.Equation e = new asv.Equation(1, 5, 6);
    Assert.assertEquals(e.rootNumber(), 2);
  }

  @Test
  public void testLinear () {
    asv.Equation e = new asv.Equation(0, 1, 1);
    Assert.assertEquals(e.rootNumber(), 1);
  }

  @Test
  public void testConstant () {
    asv.Equation e = new asv.Equation(0, 0, 1);
    Assert.assertEquals(e.rootNumber(), 0);
  }

  @Test
  public void testZero () {
    asv.Equation e = new asv.Equation(0, 0, 0);
    Assert.assertEquals(e.rootNumber(), -1);
  }
}