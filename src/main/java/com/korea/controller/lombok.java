package com.korea.controller;
import org.junit.Test;
import org.korea.sample.Person;

public class lombok {

	@Test
	public void test() {
		Person hong = new Person("ȫ�浿","15","�뱸");
		System.out.println(hong.toString());
		
		Person obj1 = Person.builder()
				.age("55")
				.name("���浿")
				.addr("�뱸")
				.build();
		
		System.out.println(obj1.toString());
	}

}
