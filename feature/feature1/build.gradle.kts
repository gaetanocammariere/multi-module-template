plugins {
    alias(libs.plugins.template.android.feature)
    alias(libs.plugins.template.android.hilt)
}

android {
    namespace = "com.samples.feature1"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
}