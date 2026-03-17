import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    java
    id("com.gradleup.shadow") version "9.3.0"
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.github.com/Electroid/SportPaper") {
        name = "SportPaper"
        credentials {
            username = project.findProperty("gpr.user")?.toString()
            password = project.findProperty("gpr.key")?.toString()
        }
    }


    maven("https://maven.pkg.github.com/danib150/Yamler") {
        name = "Yamler"
        credentials {
            username = project.findProperty("gpr.user")?.toString()
            password = project.findProperty("gpr.key")?.toString()
        }

    }

}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.44")
    annotationProcessor("org.projectlombok:lombok:1.18.44")
    compileOnly("app.ashcon:sportpaper:1.8.8-R0.1-SNAPSHOT")
    compileOnly("io.github.danib150:yamler-core:2.4.3")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.withType<ShadowJar>() {
    archiveClassifier.set("")


}

