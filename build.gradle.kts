plugins {
    id("java")
}

group = "de.winterhost"
version = "1.0-SNAPSHOT"

tasks.jar {
    manifest {
        attributes["Main-Class"] = "de.winterhost.sslCheck.SSLCheck"
    }
}

repositories {
    mavenCentral()
}

dependencies {

}