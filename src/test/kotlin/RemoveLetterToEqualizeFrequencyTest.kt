import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.RemoveLetterToEqualizeFrequency
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RemoveLetterToEqualizeFrequencyTest {

    private lateinit var frequency: RemoveLetterToEqualizeFrequency

    @BeforeAll
    fun init() {
        frequency = RemoveLetterToEqualizeFrequency()
    }

    @Test
    fun firstScenario() {
        // Given
        val input = "aabcdefgh"
        val expected = true

        // When
        val result = frequency(input)

        // Then
        assertEquals(expected, result)
    }

    @Test
    fun secondScenario() {
        // Given
        val input = "abcdefgh"
        val expected = false

        // When
        val result = frequency(input)

        // Then
        assertEquals(expected, result)
    }

    @Test
    fun thirdScenario() {
        // Given
        val input = "aabcdeefgh"
        val expected = false

        // When
        val result = frequency(input)

        // Then
        assertEquals(expected, result)
    }

    @Test
    fun fourthScenario() {
        // Given
        val input = "abcdefghoo"
        val expected = true

        // When
        val result = frequency(input)

        // Then
        assertEquals(expected, result)
    }
}