import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import solutions.Demo
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DemoTest {

    private lateinit var demo: Demo

    @BeforeAll
    fun init() {
        demo = Demo()
    }

    @Test
    fun firstScenario() {
        // Given
        val num = 5
        val expected = 1

        // When
        val demoArgs = Demo.DemoArgs(num)
        val result = demo(demoArgs)

        // Then
        val expectedResult = Demo.DemoReturn(expected)
        assertEquals(expectedResult, result)
    }

    @Test
    fun secondScenario() {
        // Given
        val num = -4
        val expected = -1

        // When
        val demoArgs = Demo.DemoArgs(num)
        val result = demo(demoArgs)

        // Then
        val expectedResult = Demo.DemoReturn(expected)
        assertEquals(expectedResult, result)
    }

    @Test
    fun thirdScenario() {
        // Given
        val num = 0
        val expected = -1

        // When
        val demoArgs = Demo.DemoArgs(num)
        val result = demo(demoArgs)

        // Then
        val expectedResult = Demo.DemoReturn(expected)
        assertEquals(expectedResult, result)
    }
}