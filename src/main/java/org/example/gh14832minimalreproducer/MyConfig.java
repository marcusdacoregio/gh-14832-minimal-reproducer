package org.example.gh14832minimalreproducer;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	private final DependencyOne dependencyOne;

	private final AutowireCapableBeanFactory autowireCapableBeanFactory;

	public MyConfig(DependencyOne dependencyOne, AutowireCapableBeanFactory autowireCapableBeanFactory) {
		this.dependencyOne = dependencyOne;
		this.autowireCapableBeanFactory = autowireCapableBeanFactory;
	}

	@PostConstruct
	public void init() {
		System.out.println("Initializing");
		this.autowireCapableBeanFactory.initializeBean(this.dependencyOne, this.dependencyOne.toString());
	}

}
