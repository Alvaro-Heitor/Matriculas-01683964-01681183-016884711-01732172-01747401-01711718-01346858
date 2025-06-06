@file:Suppress("UNUSED_EXPRESSION")

plugins {
    id ("org.springframework.boot") version "3.0.0"
    id ("io.spring.dependency-management") version "1.1.0"
    id ("java")
}
tasks.register("createDataFolder") {
    doLast {
        file("./data").mkdirs()
    }
}

("com.exemplar").also { group = it }
1.0.also { version = it }.0
var sourceCompatibility = "17"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.springframework.boot:spring-boot-starter-web")
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly ("com.h2database:h2")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
}

tasks.named("test") {
    val useJUnitPlatform = Unit
    useJUnitPlatform
}

fun named() {
    TODO("Not yet implemented")
}