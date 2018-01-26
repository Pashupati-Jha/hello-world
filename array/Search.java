import java.util.Scanner;
class Search {

	static int linearSearch(int array[], int item) {
		for(int i = 0; i < array.length; i ++) {
			if(item == array[i]) {
				return i;
			}
		}
		return -1;
	}

	static int binarySearch(int array[], int low, int high, int item) {
		if(high >= low) {
			int mid = (low + high) / 2;
			if(array[mid] ==  item) {
				return mid;
			} else if (array[mid] > item) {
				return binarySearch(array, low, mid - 1, item);
			} else {
				return binarySearch(array, mid + 1, high, item);
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of the array : ");
		int size = sc.nextInt();
		int array[] = new int[size];

		System.out.println("Enter arra elements(" + size + ")");
		for (int i = 0 ; i < size ; i ++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Enter the element to be search : ");
		int item = sc.nextInt();

		Search search = new Search();
		int index = search.linearSearch(array, item);
		if(index != -1) {
			System.out.println("item is found at - "+ index +" th index");
		} else {
			System.out.println("Not found");
		}

		index = search.binarySearch(array, 0, array.length - 1, item);
		if(index != -1) {
			System.out.println("item is found at - "+ index +" th index");
		} else {
			System.out.println("Not found");
		}




	}
}