def bubbleSorting(array):
	for i in range(len(array)):
		for j in range(len(array) - 1 - i):
			if array[j] > array[j+1]:
				temp = array[j]
				array[j] = array[j+1]
				array[j+1] = temp
	
	return array;

print("***************  Bubble Sort ***************)			
print("Enter the size of array : ")
length = input()
print("please enter array's data : ")
array = []
for i in range(length):
	array.append(input())

bubbleSorting(array)
print("sorted array ")
for item in array:
	print(item)

