import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input = {0, 1, 2, 3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{0, 1, 2, 3}, input);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {3, 2, 1, 0};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{0, 1, 2, 3}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { 1 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }
}
