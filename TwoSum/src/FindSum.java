
public class FindSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {3, 5, 7, 9, -1, 6};
		int sum = 1;
		
		int[] numbers1 = {-6, 0, 3, 19, 2, 7};
		int sum1 = 22;
		
		String answer = "The answer is ";
		
		// false expected
		boolean twoSum = getSum(numbers, sum);
		System.out.println(answer + twoSum);
		System.out.println();
		
		// true expected
		boolean twoSum1 = getSum(numbers1, sum1);
		System.out.println(answer+ twoSum1);
	}
	
	public static boolean getSum(int[] array, int sum) {
		for(int i=0; i < array.length; i++) {
			for(int g=i + 1; g < array.length; g++) {
				int num = sum - array[i];
				
				if(array[g] == num) {
					return true;
				}
			}
		}
		return false;
	}

}
