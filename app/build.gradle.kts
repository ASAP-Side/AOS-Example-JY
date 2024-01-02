plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.app"
    compileSdk = Apps.compileSdk

    defaultConfig {
        minSdk = Apps.minSdk
        targetSdk = Apps.targetSdk
        versionCode = Apps.versionCode
        versionName = Apps.versionName
    }

    compileOptions {
        sourceCompatibility = Apps.sourceCompatibility
        targetCompatibility = Apps.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = Apps.jvmTarget
    }
}

dependencies {
    implementation(project(Modules.Presentation))
    implementation(project(Modules.Domain))
    implementation(project(Modules.Data))

    implementation(Dependencies.Core.Core)
    implementation(Dependencies.AppCompat.Core)
    implementation(Dependencies.Material.Core)
}