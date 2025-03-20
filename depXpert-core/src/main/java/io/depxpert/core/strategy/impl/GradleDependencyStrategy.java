package io.depxpert.core.strategy.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.depxpert.core.strategy.IDependencyStrategy;
@Component
public class GradleDependencyStrategy implements IDependencyStrategy {
	private static final Logger logger = LoggerFactory.getLogger(GradleDependencyStrategy.class);

	public void checkDependencies() {

	}

	@Override
	public void updateDependencies() {

	}

	@Override
	public void suggestFixes() {

	}

	@Override
	public void analyzeDependencies(String repoPath) {
		logger.info("Analysing dependencies..." + repoPath);

	}

}
