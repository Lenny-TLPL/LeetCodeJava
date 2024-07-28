package com.example.leetcodejava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortJumbled {
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer, Integer> numberMapping = new HashMap<>();
        for (int num : nums) {
            if (!numberMapping.containsKey(num)) {
                numberMapping.put(num, mapping(num, mapping));
            }
        }
        Integer[] numsBoxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsBoxed, Comparator.comparingInt(numberMapping::get));
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsBoxed[i];
        }
        return nums;
    }

    private static int mapping(int num, int[] mapping) {
        char[] digits = Integer.toString(num).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            digits[i] = (char) ('0' + mapping[digits[i] - '0']);
        }
        return Integer.parseInt(new String(digits));
    }
}
