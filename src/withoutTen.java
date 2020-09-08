public class withoutTen {
  public int[] withoutTen(int[] nums) {
    int count = 0;
    int[] result = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 10) {
        result[count] = nums[i];
        count++;
      }
    }
    return result;
  }

// No need to work on the zeros at the end because it will be filled with zeros
// by default anyway.
}
