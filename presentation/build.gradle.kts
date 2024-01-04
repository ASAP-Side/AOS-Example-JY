plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.presentation"
    compileSdk = Apps.compileSdk

    defaultConfig {
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
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.2"
    }
}

dependencies {
    implementation(project(Modules.Domain))
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation(Dependencies.Core.Core)
    implementation(Dependencies.Lifecycle.Runtime)
    Dependencies.Compose.core.forEach(::implementation)
    Dependencies.Compose.sub.forEach(::implementation)
}