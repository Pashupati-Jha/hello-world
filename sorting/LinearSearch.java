import java.util.Scanner;
class LinearSearch {

public static void main(String[] args) {
		System.out.println("Welcome to linear search: ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the length of an array: ");
		int arrayLength = scanner.nextInt();
		int array[] = new int[arrayLength];
		int i = 0;
		while(i < arrayLength) {
			array[i++] = scanner.nextInt();
		}
		i = 0;
		while(i < arrayLength) {
			System.out.println(i + " : " + array[i]);
			i++;
		}
		scanner.close();
		System.out.println("hello Welcome");
	}
}
