package com.pedroperez.java9newfeatures.collections;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CollectionFactoryMethodsTest {
    @Test
    public void testCollectionFactoryMethods() {
        Set<Integer> ints = Set.of(1, 2, 3);
        assertThat(ints.contains(1)).isEqualTo(true);
        List<String> strings = List.of("first", "second");
        assertThat(strings.contains("first")).isEqualTo(true);
    }

    @Test
    public void testCollectionFactoryMethodsException() {
        Set<Integer> ints = Set.of(1, 2, 3);
        try {
            ints.add(6);
        } catch (Exception e) {
            assertThat(e instanceof UnsupportedOperationException).isEqualTo(true);
        }


    }
}
