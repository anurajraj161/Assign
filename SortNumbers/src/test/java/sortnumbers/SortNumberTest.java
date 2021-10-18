package sortnumbers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sortnumbers.SortNumber;

public class SortNumberTest {
 
	@Test
	public void givenElementsToSortThenShouldReturnSortedElements()
	{
		List<Integer> initial = new ArrayList<Integer>(Arrays.asList(11,111, 76, 12, 67, 76, 45, 899, 99, 0  ));
		
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 11, 12, 45, 67, 76, 99, 111, 899));
		
		assertEquals(expected, SortNumber.sorting(initial));
	}

}