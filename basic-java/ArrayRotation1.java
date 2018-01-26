import java.util.Scanner;
class ArrayRotation1 {

	//used Extra space O(d)
	void rotateArrayByDMethod1(int array[], int d) 
	{
		int temp[] = new int[d];
		for(int j = 0 ; j < d ; j ++) {
			temp[j] = array[j]; 
		}
		for( int i = d ; i < array.length ; i ++) {
			array [i - d] = array[i];
		}
		for(int j = 0 ; j < d ; j ++) {
			array[array.length - d + j] = temp[j] ;
		}
		for( int i = 0 ; i < array.length ; i ++) {
			System.out.println(array[i]);
		}
	}

	static void reverseSubArray(int array[], int startIndex, int endIndex) {
		int left = startIndex;
		int right = endIndex;
		while(left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left ++;
			right --;
		}
	}

	void rotateArrayByDMethod2(int array[], int d) {
		reverseSubArray(array, 0, d - 1);
		reverseSubArray(array, d, array.length -1);
		reverseSubArray(array, 0, array.length -1);
		for( int i = 0 ; i < array.length ; i ++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int array[] = {1 , 2 , 3 , 4 , 5 , 6};
		System.out.println("enter the value by which you want to rotate left");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		System.out.println("entered number : " + d);
		ArrayRotation1 arrayRotation = new ArrayRotation1();
		System.out.println("mehtond 1- using extra spack d");
		arrayRotation.rotateArrayByDMethod1(array, d);
		System.out.println("mehtond-2 without using extra space");
		arrayRotation.rotateArrayByDMethod2(array, d);
	}
}