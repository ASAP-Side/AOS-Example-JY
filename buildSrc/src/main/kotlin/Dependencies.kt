object Dependencies {

    object Core {
        const val Core = "androidx.core:core-ktx:${Versions.Core.Core}"
    }

    object AppCompat {
        const val Core = "androidx.appcompat:appcompat:${Versions.AppCompat.Core}"
    }

    object Material {
        const val Core = "com.google.android.material:material:${Versions.Material.Core}"
    }

    object Compose {
        val core = listOf(
            "androidx.compose.ui:ui",
            "androidx.compose.ui:ui-graphics",
            "androidx.compose.ui:ui-tooling-preview",
            "androidx.compose.material3:material3"
        )

        val sub = listOf(
            "androidx.activity:activity-compose:${Versions.Compose.Activity}"
        )
    }

    object Lifecycle {
        const val Runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Lifecycle.Runtime}"
    }
}
