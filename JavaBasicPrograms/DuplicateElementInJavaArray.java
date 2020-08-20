package JavaBasicPrograms;

public class DuplicateElementInJavaArray {

	public static void main(String[] args) {
	
		String[] names= {"java","India","Pune","Mumbai","java"};
		
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if(names[i].equals(names[j]))
				{
					System.out.println("duplicate element is "+ names[i]);
				}
				
			}
			
		}
 	}

}
