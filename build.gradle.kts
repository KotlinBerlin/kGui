plugins {
    kotlin("multiplatform") version "1.4-M2"
}
group = "de.kotlin-berlin"
version = "1.0-FINAL"

repositories {
    mavenCentral()
    maven {
        url = uri("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}
kotlin {
    js {
        browser {
            
        }
    }
    jvm("jvmDesktopSwing") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    jvm("jvmDesktopJfx") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    jvm("jvmWebVaadin") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
        val jvmDesktopSwingMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }
        val jvmDesktopSwingTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }
        val jvmDesktopJfxMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }
        val jvmDesktopJfxTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }
        val jvmWebVaadinMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }
        val jvmWebVaadinTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }
    }
}