package calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import calculator.Calculator;    //if we use private Calculator

public class CalculatorTest {
	Calculator c;      //private Calculator c;
	@BeforeEach
	void setup() {
		c=new Calculator();
	}
	
	@Test
	@DisplayName("Test addition with two numbers")
	public void testTwoAndTwoGivesFour() {
		assertEquals(4, c.add(2,2));
	}
	@Test
	@DisplayName("Test addition with two numbers")
	public void testFiveAndFourGivesFour() {
		assertEquals(9, c.add(5,4));
	}
	@RepeatedTest(3)
	@DisplayName("Test sum with repeated execution")
	public void testSumRepeatedr() {
		assertEquals(10, c.add(5,5), "Sum of 5 and 5");
	}
	@Nested
	@DisplayName("Subtraction Tests")
	class SubtractionTests{
		
		@Test
		@DisplayName("Test subtraction of two numbers")
		void testSubtraction() {
			assertEquals(1, c.sub(5,4));
		}
		
		@Test
		@DisplayName("Test subtraction of two numbers")
		void testSubtraction2() {
			assertEquals(5, c.sub(10,5));
		}
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4,5})
	@DisplayName("Test multiplication of numbers by 2")
	void testMultiplyByTwo(int number) {
		assertEquals(number * 2, c.multiply(number, 2));
	}
	@ParameterizedTest
	@CsvSource({"2,2,4","2,3,6","4,4,16"})
	void testMultiply(int x,int y,int expected) {
		assertEquals(expected, c.multiply(x, y));
	}
	@ParameterizedTest
	@CsvFileSource(resources ="/c-data.csv",numLinesToSkip=1)
	@DisplayName("Test sum using CSV file")
	void testSumUsingCsvFile(int x,int y,int expected) {
		assertEquals(expected, c.add(x,y));
	}
}
