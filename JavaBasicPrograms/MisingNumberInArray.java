package JavaBasicPrograms;

public class MisingNumberInArray {
	
	public static void main(String[] args) {
		
		int [] a= {1,2,4,5};
		/*int[] b= {1,3,4,5};
		int[] c= {5,4,3,2};*/
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			
			sum=sum+a[i];
			
		}
System.out.println(sum);	

int sum1=0;

for (int j =0; j <=5; j++) {
	sum1=sum1+j;
	
}
System.out.println(sum1);

System.out.println("mising number"+ (sum1-sum));
	}
	

}
