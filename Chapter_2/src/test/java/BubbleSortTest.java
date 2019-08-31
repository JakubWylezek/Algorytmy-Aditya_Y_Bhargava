import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    public void setUp() {
        bubbleSort = new BubbleSort();
    }

    @ParameterizedTest
    @MethodSource("intArrayProvider")
    void bubbleSort(int[] givenArray, int[] excpectedArray) {
        //when
        int[] array = bubbleSort.bubbleSort(givenArray);

        //then
        assertArrayEquals(array, excpectedArray);
    }

    private static Stream<Arguments> intArrayProvider() {
        return Stream.of(
                Arguments.of(new int[] {5, 5, 2, 1, 3, 2, -1}, new int[] {-1, 1, 2, 2, 3, 5, 5}),
                Arguments.of(new int[] {0, 0, 0, 0, 0, -111}, new int[] {-111, 0, 0, 0, 0, 0}),
                Arguments.of(new int[] {555, 221, -0, 0 + 1, 222}, new int[] {0, 1, 221, 222, 555}),
                Arguments.of(new int[] {222 - 100, 22, 1, 2, 3, 1}, new int[] {1, 1, 2, 3, 22, 122})
        );
    }
}