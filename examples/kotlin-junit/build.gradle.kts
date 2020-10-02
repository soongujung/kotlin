plugins {
    groovy
    java
    kotlin("jvm") version "1.3.72"
}

group = "io.study.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:2.3.11")
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("org.jetbrains.kotlin", "kotlin-test-junit5", "1.3.72")
//    testImplementation("junit", "junit", "4.12")
    // https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-test-junit5
//    testCompile group: 'org.jetbrains.kotlin', name: 'kotlin-test-junit5', version: '1.3.72'

}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}