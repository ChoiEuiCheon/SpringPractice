package org.korea.sample;

import org.springframework.stereotype.Component;
import lombok.*;

@Component
@Data
@AllArgsConstructor
@Builder
public class Person {
	private String name;
	private String age;
	private String addr;
}
