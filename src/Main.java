import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        1.Write a Java program to test if the first and the last element of an array of
//        integers are same. The length of the array must be greater than or equal to
//        2 Test Data:
//        array = 50, -20, 0, 30, 40, 60, 10
//        Sample Output: false

        int [] array = {50, -20, 0, 30, 40, 60, 10};
        boolean isEqual = false;
        for (int i = 0; i < array.length; i++) {
            if (array[0] == array[array.length -1]) {
                isEqual = true;
            }
        }

        System.out.println(isEqual);

//        2.Write a Java program to find the numbers greater than the average of the
//        numbers of a given array.
//                Original Array:
//        [1, 4, 17, 7, 25, 3, 100]

//        Expected Output:
//        The average of the said array is: 22.0 The numbers in the said array that are
//        greater than the average are: 25 100
        System.out.println("\n");

        int [] numbers = {1, 4, 17, 7, 25, 3, 100};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = sum / numbers.length;

        ArrayList<Integer> greater = new ArrayList();

        for (int n: numbers) {
            if (n > average) {
                greater.add(n);
            }
        }

        System.out.println("The average of the array: " + average);
        System.out.println("greater than the average are : " + greater);




//        3.Write a Java program to get the larger value between first and last
//        element of an array of integers.
//        Original Array:
//        [20, 30, 40]
//        Sample Output:
//        Larger value between first and last element: 40
        System.out.println("\n");

        ArrayList<Integer> numbers1 = new ArrayList();
        numbers1.add(20);
        numbers1.add(30);
        numbers1.add(40);

        int larger_value = 0;
        for (int i = 0; i < numbers1.size(); i++) {
            if (numbers1.get(0) > numbers1.get(numbers1.size() -1)) {
                larger_value = numbers1.get(0);
            } else larger_value = numbers1.get(numbers1.size() -1);
        }

        System.out.println("Larger value between first and last element: " + larger_value);

//        4.Write a Java program to swap the first and last elements of an array and
//        create a new array.
//                Original Array:
//        [20, 30, 40]
//        Sample Output:
//        New array after swapping the first and last elements: [40, 30, 20]
        System.out.println("\n");


        ArrayList<Integer> newArr = new ArrayList();
        for (int n: numbers1) {
            newArr.add(n);
        }
        int firstEle = newArr.get(0);
        int lastEle = newArr.get(newArr.size() -1);
        newArr.set(0, lastEle);
        newArr.set(newArr.size()-1, firstEle);

        System.out.println("The original Array: " + numbers1);
        System.out.println("New array after swapping the first and last elements: " + newArr);


//        5. Write a program that places the odd elements of an array before the
//        even elements.
//        Original Array:
//        [2,3,40,1,5,9,4,10,7]
//        Sample Output:
//        [3,1,5,9,7,2,40,4,10]
        System.out.println("\n");

        int [] myArr = {2,3,40,1,5,9,4,10,7};
        ArrayList<Integer> sortedArr = new ArrayList();

        for (int n: myArr) {
            if (n % 2 != 0) {
                sortedArr.add(n);
            }
        }
        for (int m: myArr) {
            if (m % 2 == 0) {
                sortedArr.add(m);
            }
        }

        System.out.println("The original array: " + Arrays.toString(myArr));
        System.out.println("Array with odd elements before even: " + sortedArr);



//        6. Write a program that test the equality of two arrays.
//        [2,3,6,6,4] [2,3,6,6,4]
//        Sample Output: true
        System.out.println("\n");

        int [] array1 = {2,3,6,6,4};
        int [] array2 = {2,3,6,6,4};
        boolean equalArr = true;

        if (array1.length != array2.length) {
            equalArr = true;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    equalArr = false;
                    break;
                }
            }
        }
        System.out.println(equalArr);

    }
}