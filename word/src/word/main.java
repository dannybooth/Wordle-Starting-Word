package word;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		Scanner sc2 = null;
		List<String> words = new ArrayList<>();
	    try {
	        sc2 = new Scanner(new File("words.txt"));
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();  
	    }
	    
	    while (sc2.hasNextLine()) {
	        Scanner s2 = new Scanner(sc2.nextLine());
	        while (s2.hasNext()) {
	            String s = s2.next();
	            if(s.length()==5)
	            {
	            	words.add(s);
	            }
	        }
	    }
	    
	    
	    
	    
	    Random rand = new Random();
		int min = 0;
		int max = words.size();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		
		System.out.println(words.get(randomNum));
		
	    
	}

}