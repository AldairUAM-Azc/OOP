import java.util.Scanner;

/**
 * Arreglos
 */
public class Arreglos {

    public static void main(String[] args) {
        // int[] array = new int[]{9,8,7,6,5,4,3,2};
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = getInt();
        }
        System.out.println(max(array));
        System.out.println(min(array));
        System.out.println(avg(array));
        System.out.println("BEFORE");
        printArray(array);
        bubbleSort(array);
        System.out.println("AFTER");
        printArray(array);
    }

    public static int getInt() {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        s.close();
        return input;
    }

    public static int max(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(max < nums[i])
              max = nums[i];
        }
        return max;
    }

    public static int min(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(min > nums[i])
              min = nums[i];
        }
        return min;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static float avg(int[] array){
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }
    public static void bubbleSort(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            for (int j = 1; j < nums.length-i; j++) {
                
                if(nums[j-1] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                
            }
        }

    }
}