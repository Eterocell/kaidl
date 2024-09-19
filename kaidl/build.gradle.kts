import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("application")
    kotlin("jvm")
    `maven-publish`
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType(KotlinCompile::class) {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(libs.ksp.api)
    implementation(libs.poet)
}
