package io.depxpert.core.strategy;

public interface IDependencyStrategy {
	void analyzeDependencies(String repoPath); // method to check dependencies
	void suggestFixes();
	void updateDependencies(); // method to update dependencies
}
