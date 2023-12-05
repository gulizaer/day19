import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        int[] numbers={100,150,200,250,300,350,400,450,500,550,600};
        int[] reverseNum= new int[numbers.length];


        for (int i = numbers.length - 1; i >= 0; i--) {

            reverseNum[numbers.length-1-i]=numbers[i];


        }
        System.out.println(Arrays.toString(reverseNum));

    }
}
/*
 Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */
