package com.example.leetcodejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

import static com.example.leetcodejava.SortJumbled.sortJumbled;

@SpringBootApplication
public class LeetCodeJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeetCodeJavaApplication.class, args);
        System.out.println(Arrays.toString(sortJumbled(new int[]{8, 9, 4, 0, 2, 1, 3, 5, 7, 6}, new int[]{991, 338, 38})));
    }

}
