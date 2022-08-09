package com.korea.sample;


import org.springframework.stereotype.Component;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class Person {
	private String name;
	private String age;
	private String addr;
}
