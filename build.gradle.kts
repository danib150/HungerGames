
plugins {
    java
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

}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.44")
    annotationProcessor("org.projectlombok:lombok:1.18.44")
    compileOnly("app.ashcon:sportpaper:1.8.8-R0.1-SNAPSHOT")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

