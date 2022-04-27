package com.pedroperez.java9newfeatures.stream;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StreamAPIimprovementsTest {
    @Test
    public void testStreamAPIimprovements_iterate() {
        IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(testI -> {
            assertThat(testI < 100).isEqualTo(true);
        });
    }

    @Test
    public void testStreamAPIimprovements_optional() {
        Stream<Integer> s = Optional.of(1).stream();
        assertThat(s.count()).isEqualTo(1);

    }
}
