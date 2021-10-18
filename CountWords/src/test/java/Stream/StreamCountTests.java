package Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.Test;

import stream.StreamCount;




public class StreamCountTests {
	
	@Test
	public void ifWordsAreGivenShouldReturnTheCountOfEachWord() throws FileNotFoundException
	{
		Scanner s = new Scanner(new File("C:\\Users\\Dell\\Desktop\\CountDoc.txt"));
		List<String> list = new ArrayList<String>();
		while (s.hasNext())
		{
			list.add(s.next());
		}
		s.close();
		
		//Map<String, Integer> words = new HashMap<String, Long>();
		
		
	Map<String, Long> newwords=new HashMap<String, Long>();
		
		
		newwords.put("Program",1L); 
		newwords.put("Hello",3L);
		newwords.put("Hii",1L);
		newwords.put("Welcome",1L);
		newwords.put("End",1L);
		newwords.put("Count",1L);
		
		//StreamCount sc = new StreamCount();
		
		Map<String, Integer> words = StreamCount.CountEachWords(list);
		
		words=StreamCount.CountEachWords(list);
		//words=Countofwords.CountEachWords(list);
	   // System.out.println(vwords);
		
		assertThat(newwords, is(words));
		
		newwords.equals(new File("C:\\Users\\Dell\\Desktop\\CountDoc.txt"));  //
	}

}


