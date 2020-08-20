package JavaBasicPrograms;

public class SplitInString {
	
	public static void main(String[]args)
	{
		
		String test= "I_Love_India_and_I_Proud_to_be_Indian";
		
		//split will return array so store in array variable
		String testvalue[]= test.split("_");
		
		//to print all the value of array use for loop
		
		for (int i = 0; i < testvalue.length; i++) {
			
			System.out.println(testvalue[i]);
			
		}
	
		
		
	}

}
