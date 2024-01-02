plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.data"
    compileSdk = Apps.compileSdk

    defaultConfig {
        minSdk = Apps.minSdk
        targetSdk = Apps.targetSdk
    }
}

dependencies {
    implementation(project(Modules.Domain))

    implementation(Dependencies.Core.Core)
    implementation(Dependencies.AppCompat.Core)
    implementation(Dependencies.Material.Core)
}