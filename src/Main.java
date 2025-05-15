import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int[] arr = new int[] {1, 2, 3};

        double[] doubleArr = {1.57, 7.654, 9.986};

        int[] nums = {1, 3, 5};

        System.out.println("Task 2");

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        for (int i1 = 0; i1 < doubleArr.length; i1++) {
            if (i1 < doubleArr.length - 1) {
                System.out.print(doubleArr[i1] + ", ");
            } else {
                System.out.print(doubleArr[i1]);
            }
        }
        System.out.println();
        for (int i2 = 0; i2 < nums.length; i2++) {
            if (i2 < nums.length - 1) {
                System.out.print(nums[i2] + ", ");
            } else {
                System.out.print(nums[i2]);
            }
        }
        System.out.println();

        System.out.println("Task 3");

        for (int i3 = arr.length - 1; i3 >= 0; i3--) {
            if (i3 > 0) {
                System.out.print(arr[i3] + ", ");
            } else {
                System.out.print(arr[i3]);
            }
        }
        System.out.println();
        for (int i4 = doubleArr.length - 1; i4 >= 0; i4--) {
            if (i4 > 0) {
                System.out.print(doubleArr[i4] + ", ");
            } else {
                System.out.print(doubleArr[i4]);
            }
        }
        System.out.println();
        for (int i5 = nums.length - 1; i5 >= 0; i5--) {
            if (i5 > 0) {
                System.out.print(nums[i5] + ", ");
            } else {
                System.out.print(nums[i5]);
            }
        }
        System.out.println();

        System.out.println("Task 4");

        int[] a = new int[] {1, 2, 3};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] += 1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}


