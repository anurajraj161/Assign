package sortnumbers;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class SortNumber {
	public static List<Object> sorting(List<Integer> list) {
		List<Object> sortedList = list.stream().sorted().distinct().collect(Collectors.toList());
		return sortedList;
		
	}

	public static void main(String[] args) {
	  
		Scanner file = null;
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		try {
			file = new Scanner(new File("C:\\Users\\Dell\\Desktop\\Sort.txt"));
			System.out.println("File found");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
			System.out.println(e);
		}
		while(file.hasNext())
		{
    	 
			if(file.hasNextInt())
			{
				list.add(file.nextInt());
			}
			else file.next();
		}
	
		List<Object> sorted =sorting(list);	
		System.out.println(sorted);
	}
		
}