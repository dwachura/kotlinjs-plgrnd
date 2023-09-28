plugins {
    kotlin("multiplatform") version "1.9.0"
}

group = "io.dwsoft"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            kotlin { setSrcDirs(listOf("js/main/kotlin")) }
            resources.setSrcDirs(listOf("js/main/resources"))

            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.9.1")
            }
        }
        val jsTest by getting {
            kotlin { setSrcDirs(listOf("js/test/kotlin")) }
            resources.setSrcDirs(listOf("js/test/resources"))
        }
    }
}
