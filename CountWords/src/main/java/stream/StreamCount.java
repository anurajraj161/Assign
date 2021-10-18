package stream;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.List;




public class StreamCount {
	public static Map<String,Integer> CountEachWords(List<String> list) throws FileNotFoundException {
		Map<String,Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(result);
		return null;
	}

	public static void main(String[] args) throws FileNotFoundException {		
		Scanner s = new Scanner(new File("C:\\Users\\Dell\\Desktop\\CountDoc.txt"));
		List<String> list = new ArrayList<String>();
		while (s.hasNext())
		{
			list.add(s.next());
		}
		s.close();
		CountEachWords(list);
		System.out.println(list);
	}
}