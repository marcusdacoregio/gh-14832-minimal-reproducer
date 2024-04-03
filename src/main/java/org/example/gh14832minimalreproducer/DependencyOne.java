package org.example.gh14832minimalreproducer;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DependencyOne {

	@Transactional
	public void myMethod() {

	}

}
