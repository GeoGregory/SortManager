package com.example.gg;

import com.example.gg.display.ArrayGen;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ArrayGenTests {

    ArrayGen arrayGen = new ArrayGen();

    @ParameterizedTest()
    @MethodSource("testInts")
    @DisplayName("Array has a length of x")
    void arrayHasALengthOfX(int num) {
        assertThat(num, is(arrayGen.startGen(num).length));
    }

    public static Stream<Arguments> testInts() {
        return Stream.of(
                Arguments.arguments(1),
                Arguments.arguments(8),
                Arguments.arguments(15),
                Arguments.arguments(66),
                Arguments.arguments()
        );
    }
}
