package AfterFour;

import java.util.Arrays;

public class AfterFour {
    public int[] СheckingFours(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }

        }
        throw new RuntimeException("Invalid array");
    }


    public boolean task2(int[] array) {

        boolean contains1 = false;
        boolean contains4 = false;

        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 1:
                    contains1 = true;
                    break;
                case 4:
                    contains4 = true;
                    break;
                default:
                    return false;
            }
        }
        return contains1 && contains4;
    }

}