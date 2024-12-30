package Array;

import java.util.HashSet;
import java.util.Set;

public class sumOfNumber {

  public static int[] addTwoNumbers(int[] arr1, int target) {
      for (int i = 0; i < arr1.length-1; i++) {
          for (int j = i+1; j < arr1.length; j++) {
              if (arr1[i] + arr1[j] == target) {
                  return  new int[]{arr1[i], arr1[j]};
              }
          }
      }
      return new int[0];
  }

  public static int[] addTwoNumbersSet(int[] arr1, int target) {
      Set<Integer> nums = new HashSet<>();
      for (int i = 0; i < arr1.length; i++) {
          int num = arr1[i];
          int match = target - num;
          if (nums.contains(match)) {
              return new int[]{match, num};
          } else {
              nums.add(num);
          }
      }
      return new int[0];
  }

  public static void main(String[] args) {
      int[] arr1 = {6,8,4,8,0,7,9};
      int[] arr2 = addTwoNumbers(arr1, 10);
      int[] arr3 = addTwoNumbersSet(arr2, 10);
      for (int j : arr3) {
          System.out.println(j);
      }
  }
}
