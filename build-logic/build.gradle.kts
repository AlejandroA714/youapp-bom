plugins {
    kotlin("jvm") version "2.2.0"
    `java-gradle-plugin`
    `maven-publish`
}

group = "com.sv.youapp.infrastructure"
version = "1.0.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.25.0")
}

kotlin {
    jvmToolchain(21)
}

gradlePlugin {
    plugins {
        create("formatterPlugin") {
            id = "com.sv.youapp.formatter"
            implementationClass = "com.sv.youapp.formatter.FormatterPlugin"
            displayName = "YouApp Formatter Plugin"
            description = "Aplica y configura Spotless (ktlint, googleJavaFormat, etc.)"
        }
    }
}


