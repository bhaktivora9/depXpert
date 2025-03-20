package io.depxpert.core.strategy.impl;

import io.depxpert.core.strategy.IDependencyStrategy;

public class DependencyContext {
	private IDependencyStrategy strategy;

	public DependencyContext(IDependencyStrategy strategy) {
	        this.strategy = strategy;
	    }

	public void setStrategy(IDependencyStrategy strategy) {
		this.strategy = strategy;
	}

	public void analyzeDependencies(String repoPath) {
		strategy.analyzeDependencies(repoPath);
	}

	public void suggestFixes() {
		strategy.suggestFixes();
	}
}
