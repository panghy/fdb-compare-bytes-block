import com.foundationdb.tuple.ByteArrayUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test ByteArrayUtils.
 *
 * @author clement
 */
public class TestCase {

  @Test
  public void test1() {
    // test should return 0, now it stalls forever
    assertEquals(0, ByteArrayUtil.compareUnsigned(new byte[]{-1, 0, 2, 4, 5}, new byte[]{-1, 0, 2, 4, 5}));
  }

  @Test
  public void test2() {
    // test should return 0, now it stalls forever
    assertEquals(-1, ByteArrayUtil.compareUnsigned(new byte[]{-1, 0, 2, 4, 5}, new byte[]{-1, 0, 2, 4, 6}));
  }


  @Test
  public void test3() {
    // test should return 0, now it stalls forever
    assertEquals(1, ByteArrayUtil.compareUnsigned(new byte[]{-1, 0, 2, 4, 6}, new byte[]{-1, 0, 2, 4, 5}));
  }
}
