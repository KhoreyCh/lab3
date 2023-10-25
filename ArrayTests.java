import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace5Inputs() {
    int[] input1 = { 3,4,5,6 };
    int[] input2 = {6,5,4,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(input2, input1);
	}

  @Test 
	public void testReversedInputs() {
    int[] input1 = { 3,4,5,6 };
    int[] input2 = {6,5,4,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(input2, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
}
