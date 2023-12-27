import org.gradle.api.JavaVersion

object Apps {
    const val compileSdk = 34

    const val minSdk = 26
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0"

    val sourceCompatibility = JavaVersion.VERSION_1_8
    val targetCompatibility = JavaVersion.VERSION_1_8

    const val jvmTarget = "1.8"
}