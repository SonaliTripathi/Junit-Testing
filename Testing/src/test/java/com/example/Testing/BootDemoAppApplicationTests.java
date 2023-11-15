package com.example.Testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@SpringBootTest(properties = "spring.main.lazy-initialization=true",
		//classes = {Calculator.class})
class BootDemoAppApplicationTests {

	private Calculator c = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	@Disabled
	void testSum(){
		int expectedRes = 17;
		int actualRes = c.doSum(12,3,2);

		assertThat(actualRes).isEqualTo(expectedRes);
	}

	@Test
	void testProduct(){
		//expectedRes
		int expectedRes = 6;
		//actual
		int actualRes = c.doProduct(3,2);

		assertThat(actualRes).isEqualTo(expectedRes);

	}

	@Test
	void testCompareNums(){
		Boolean actualRes = c.compareTwoNums(3,3);
		assertThat(actualRes).isTrue();
	}

}
