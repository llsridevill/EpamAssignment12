import java.util.*; 
import java.util.stream.Stream; 

class Main { 

	public static void main(String[] args) 
	{ 
	    String arr[]={"abc","abcde","akjhdf","anu","hwh","eurcd","ght"};
	    printStrings(arr);
	} 
	public static printStrings(String[] arr)
	{
		Stream<String> streamOfArray = Arrays.stream(arr); 
        Iterator<String> it = streamOfArray.iterator(); 
        while (it.hasNext()) { 
            String s=it.next();
            if(s.charAt(0)=='a' && s.length()==3)
            System.out.println(s);
        }
	}
} 