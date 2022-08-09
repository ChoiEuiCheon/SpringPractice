package com.korea.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class lombok {

	@Test
	public void test() {
		Person hong = new Person("±è","11","´ë±¸");
		System.out.println(hong.toString());
		
		
	}

}
