package segrationoftheoddandtheeven;

import java.util.Scanner;

public class SegrationOfTheOddAndTheEven {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] odd = new int[5];
        int[] even = new int[5];
        int oddLength = 0;
        int evenLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even[evenLength] = nums[i];
                evenLength = evenLength + 1;
            } else {
                odd[oddLength] = nums[i];
                oddLength = oddLength + 1;
            }
        }
        
        System.out.println("EVEN\tODD");
        for (int j=0;j<odd.length;j++){            
            System.out.println(even[j]+"\t"+odd[j]);
        }

    }

}
