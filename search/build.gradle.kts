plugins {
    kotlin("plugin.jpa") version "1.5.21"
}

dependencies {
    implementation(project(":shared:persistence"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
}
