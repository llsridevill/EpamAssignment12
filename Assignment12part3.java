import java.util.*; 
import java.util.stream.*; 

class Assignment12part3 { 

	public static void main(String[] args) 
	{ 
	    String arr[]={"abc","abcde","malayalam","anu","hwh","eurcd","tit"};
	    Stream<String> streamOfArray = Arrays.stream(arr); 
        Iterator<String> it = streamOfArray.iterator(); 
        while (it.hasNext())
        { 
            String s=it.next();
            if(isPalindrome(s))
            System.out.println(s);
        }
	} 
	public static boolean isPalindrome(String input)
	{
        String temp = input.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, input.length() / 2)
            .allMatch(i -> temp.charAt(i) == temp.charAt(temp.length() - i - 1));
    }
} 