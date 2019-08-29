import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTest {

    private LinearSearch linearSearch;

    @BeforeEach
    public void setUp() {
        linearSearch = new LinearSearch();
    }

    @ParameterizedTest
    @MethodSource("intArrayProvider")
    public void linearSearch(int[] array, int searchValue, int expected) {
        //when
        int guess = linearSearch.linearSearch(array, searchValue);

        //then
        assertEquals(expected, guess);
    }

    private static Stream<Arguments> intArrayProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 3, 2),
                Arguments.of(new int[]{56, 77, 88, 126, 200, 250, 251}, 200, 4),
                Arguments.of(new int[]{-10, -5, 0, 50, 66, 67, 279, 2000}, -5, 1),
                Arguments.of(new int[]{-10, -5, 0, 50, 66, 67, 279, 2000}, 123, -1)
        );
    }
}
