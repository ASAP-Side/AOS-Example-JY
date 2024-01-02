plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.myapplication"
    compileSdk = Apps.compileSdk

    defaultConfig {
        //applicationId = "com.example.myapplication"
        minSdk = Apps.minSdk

    }

    compileOptions {
        sourceCompatibility = Apps.sourceCompatibility
        targetCompatibility = Apps.targetCompatibility
    }

    kotlinOptions {
        jvmTarget = Apps.jvmTarget
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(Modules.Domain))
    implementation(Dependencies.Core.Core)
    implementation(Dependencies.Lifecycle.Runtime)
    Dependencies.Compose.core.forEach(::implementation)
    Dependencies.Compose.sub.forEach(::implementation)
}