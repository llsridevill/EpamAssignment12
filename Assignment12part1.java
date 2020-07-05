 
import java.util.*; 
import java.util.stream.IntStream; 

public class Main { 

	public static void main(String[] args) 
	{ 

		IntStream stream = IntStream.of(2, 3, 4, 5, 6, 7, 8); 

		OptionalDouble obj = stream.average(); 

		if (obj.isPresent()) { 
			System.out.println(obj.getAsDouble()); 
		} 
		else { 
			System.out.println("-1"); 
		} 
	} 
} 
