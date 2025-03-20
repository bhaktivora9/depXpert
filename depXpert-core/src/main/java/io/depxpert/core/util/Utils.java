package io.depxpert.core.util;


import java.io.File;

public class Utils {

    public static boolean isMavenProject(File projectRoot) {
        return new File(projectRoot, "pom.xml").exists();
    }

    public static boolean isGradleProject(File projectRoot) {
        return new File(projectRoot, "build.gradle").exists() || new File(projectRoot, "build.gradle.kts").exists();
    }
}
