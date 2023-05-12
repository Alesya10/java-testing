plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.9.1")
    testImplementation("org.seleniumhq.selenium:selenium-grid:4.9.1")
    testImplementation("io.github.bonigarcia:webdrivermanager:5.3.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}