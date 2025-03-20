package io.depxpert.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.depxpert.core.service.GitHubService;

@RestController
@RequestMapping("/api/v1")
public class DepXpertRestController {

	@Autowired
	private GitHubService gitHubService;

	/**
	 * TODO : Scan dependencies from a **local file upload** (pom.xml/build.gradle/
	 * package.json)
	 */
	@GetMapping("/depXpert")
	public String getHome() {
		return "Hello";
	}

	/**
	 * Scan dependencies from a **GitHub repository**.
	 */

	@GetMapping("/scan/repository")
	public String scanDependenciesFromGitHub(@RequestParam String repo, @RequestParam String branch) {
		try {
			gitHubService.process(branch, repo);
			return "Dependency scan initiated for GitHub repository: " + repo + "/" + branch;
		} catch (Exception e) {
			return "Failed to analyze repository: " + e.getMessage();
		}
	}
}
