package com.example.gg;

import com.example.gg.sorters.BubbleSorter;
import com.example.gg.sorters.MergeSorter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

public class SortTests {

    @ParameterizedTest()
    @MethodSource("testArrays")
    @DisplayName("Bubble sort parameterized tests")
    void bubbleSortParameterizedTests(int[] array1, int[] array2) {
        BubbleSorter bs = new BubbleSorter();
        bs.sort(array2);
        assertThat(array1, is(array2));
    }

    @ParameterizedTest()
    @MethodSource("testArrays")
    @DisplayName("Merge sort parameterized tests")
    void mergeSortParameterizedTests(int[] array1, int[] array2) {
        MergeSorter ms = new MergeSorter();
        ms.sort(array2);
        assertThat(array1, is(array2));

    }

    public static Stream<Arguments> testArrays() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 3, 4},new int[]{2, 1, 3, 4}),
                Arguments.arguments(new int[]{147, 200, 276, 409, 488, 588, 670, 674, 739, 874}
                        ,new int[]{147, 739, 276, 488, 409, 588, 670, 674, 200, 874}),
                Arguments.arguments(new int[]{1, 2},new int[]{2, 1}),
                Arguments.arguments(new int[]{1, 2},new int[]{1, 2})
        );
    }
}
