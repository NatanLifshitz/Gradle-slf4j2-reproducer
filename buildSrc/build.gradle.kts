import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.slf4j:slf4j-api:2.0.9")
    implementation("org.slf4j:slf4j-simple:2.0.9")
    implementation("aws.sdk.kotlin:s3-jvm:0.32.1-beta")
}


gradlePlugin {
    plugins {
        create("reproducePlugin") {
            id = "reproduce"
            implementationClass = "com.reproduce.ReproducePlugin"
        }
    }
}
