package com.unchk.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.unchk.helloworld.service.BusinessService;

@SpringBootTest
class HelloWorldApplicationTests {

	@Autowired
	private BusinessService bs;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testhelloworld() {
		String expected = "hello world";
		String result = bs.getHelloworld().getValue();
		assertEquals(expected, result);
	}
}