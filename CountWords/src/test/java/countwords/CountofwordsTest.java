package countwords;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;


public class CountofwordsTest {
	
	
	@Test
	public void ifWordsAreGivenShouldReturnTheCountOfEachWord() throws FileNotFoundException
	{
		Map<String, Integer> words = new HashMap<String, Integer>();
		
		Map<String, Integer> newwords=new HashMap<String, Integer>();
		
		newwords.put("Program",1); 
		newwords.put("Hello",3);
		newwords.put("Hii",1);
		newwords.put("Welcome",1);
		newwords.put("End",1);
		newwords.put("Count",1);
		
		 assertEquals(newwords,Countofwords.CountEachWords("C:\\Users\\Dell\\Desktop\\CountDoc.txt", words));
	}

}
