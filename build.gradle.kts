plugins {
    kotlin("jvm") version "1.4.20"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.4.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlin:kotlin-serialization:1.4.10")
}