plugins {
    alias(libs.plugins.template.android.library)
    alias(libs.plugins.template.android.hilt)
    alias(libs.plugins.template.android.room)
}

android {
    namespace = "com.samples.data"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
}