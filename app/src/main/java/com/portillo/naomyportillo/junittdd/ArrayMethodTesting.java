package com.portillo.naomyportillo.junittdd;

import android.support.annotation.IntRange;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayMethodTesting {

    private static ArrayMethodTesting instance;

    public static ArrayMethodTesting getInstance() {
        if (instance == null) {
            instance = new ArrayMethodTesting();
        }
        return instance;
    }

    private ArrayMethodTesting() {

    }

    public boolean isLessThan10(String[] input) {

        if (input == null) {
            return true;
        }
        return input.length < 10;
    }

    public String[] smallEvensOnly(String[] input) {

        if (input != null && input.length % 2 == 0) {

            String largest = input[0];
            final List<String> list = new ArrayList<>();

            for (String eachString : input) {
                if (largest.length() < eachString.length()) {
                    largest = eachString;
                }
            }

            for (String eachString : input) {
                if (!eachString.equals(largest)) {
                    list.add(eachString);
                }
            }
            return list.toArray(new String[0]);
        }
        return null;
    }

    public char[] sortAlphabetically(char[] input) {

        char curr;
        for (int j = input.length; j >= 0; j--) {
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    curr = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = curr;
                }
            }
        }
        return input;
    }

    public double returnSum(double[] input) {

        double sum = 0;

        for (int i = 0; i < input.length - 1; i++) {
            sum = input[i] + input[i + 1];
            sum = sum + input[i + 1];
        }
        return sum;
    }

    public Set removeCaseSensitiveDuplicates(String[] input) {

        if (input == null){
            return null;
        }

        Set<String> unique = new HashSet<>();

        for (String value: input) {
            if (!unique.contains(value)){
                unique.add(value.trim().toLowerCase());
            }
        }
        return unique;
    }

    public Map mapDuplicates(String[] input) {
        Map<String, Integer> newMap = new HashMap<>();

        int count = 1;
        for (int i = 0; i < input.length ; i++) {
            if (newMap.containsKey(input[i])) {
                count++;
            }
            newMap.put(input[i], count);
        }
        return newMap;
    }

    public static void main(String[] args) {
        ArrayMethodTesting arrayMethodTesting = ArrayMethodTesting.getInstance();

        String[] input = {"cherry", "cranberry","PIE", "pizza"};
        //double[] input = {4.5, 10, 3};
//        char[] input = {'b', 'd', 'c', 'a'};
//        System.out.println(arrayMethodTesting.sortAlphabetically(input));

//        System.out.println(Arrays.toString(arrayMethodTesting.smallEvensOnly(input)));
//         System.out.println(arrayMethodTesting.returnSum(input));

        //  System.out.println(arrayMethodTesting.mapDuplicates(input));

        System.out.println(arrayMethodTesting.removeCaseSensitiveDuplicates(input));

    }

}
