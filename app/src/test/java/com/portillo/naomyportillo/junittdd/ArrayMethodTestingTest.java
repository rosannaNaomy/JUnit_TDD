package com.portillo.naomyportillo.junittdd;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayMethodTestingTest {

    ArrayMethodTesting arrayMethodTesting;

    @Before
    public void setUp() throws Exception {
        arrayMethodTesting = ArrayMethodTesting.getInstance();
    }

    @Test
    public void check_ifLessThan10() {
        String[] input = {"less10", "ismorethan10"};
        Assert.assertTrue(arrayMethodTesting.isLessThan10(input));
    }

    @Test
    public void check_ifLessThan10Null() {
        String[] input = null;
        Assert.assertTrue(arrayMethodTesting.isLessThan10(input));
    }
//
//    @Test
//    public void check_smallEvensOnly() {
//        String[] input =  {"apples", "cherry", "cranberry"};
//        String[] expected =  {"apples", "cherry"};
//        Assert.assertArrayEquals(expected, arrayMethodTesting.smallEvensOnly(input));
//    }

    @Test
    public void check_sortAlphabetically() {
        char[] input = {'b', 'd', 'a', 'c'};
        char[] expected = {'a', 'b', 'c', 'd'};
        Assert.assertArrayEquals(expected, arrayMethodTesting.sortAlphabetically(input));
    }

    @Test
    public void check_returnSum() {
        double[] input = {4.5, 10, 3};
        double expectedSum = 17.5;
        Assert.assertEquals(expectedSum, arrayMethodTesting.returnSum(input), 0);
    }

    @Test
    public void check_removeCaseSensitive() {
        String[] input =  {"apples", "CHERRY", "cranberry"};
        Set<String> expected = new HashSet<>();
        expected.add(input[0]);
        expected.add("cherry");
        expected.add(input[2]);

        Assert.assertEquals(expected, arrayMethodTesting.removeCaseSensitiveDuplicates(input));

    }

    @Test
    public void check_mapDuplicates() {
        String[] input = {"apples", "cherry", "cranberry", "cherry", "peach"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put(input[0], 1);
        expected.put(input[2], 1);
        expected.put(input[3], 2);
        expected.put(input[4], 1);

        Assert.assertEquals(expected, arrayMethodTesting.mapDuplicates(input));
    }

    @After
    public void tearDown() throws Exception {
        arrayMethodTesting = null;
    }
}
