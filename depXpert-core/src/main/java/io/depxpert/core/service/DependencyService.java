package io.depxpert.core.service;

import org.springframework.stereotype.Component;

import io.depxpert.core.strategy.IDependencyStrategy;

@Component
public class DependencyService {

	private IDependencyStrategy strategy;
	boolean isMaven = false, isGradle = false;

	public void process(String branch, String projectRoot) {
		
	}

	public void analyzeDependencies(String string) {
		strategy.analyzeDependencies(string);
	}

	public void suggestFixes() {
		strategy.suggestFixes();
	}
}
