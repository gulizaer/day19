import java.util.Arrays;

public class ArrayZero {
    public static void main(String[] args) {

    int[] array = {10, 0, 5, 0, 1, 0};
    int[] movedZores= new int[array.length];

        int zero = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i]==0){
                continue;

            }
            movedZores[zero]=array[i];
                zero++;





        }
        System.out.println(Arrays.toString(movedZores));

}
}
/*
 write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */