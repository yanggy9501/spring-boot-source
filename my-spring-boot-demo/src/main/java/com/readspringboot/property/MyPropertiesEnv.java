package com.readspringboot.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author yanggy
 */
@Component
public class MyPropertiesEnv {

	@Value("${random.int}")
	private Integer random;
}
