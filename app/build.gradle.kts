plugins {
    alias(libs.plugins.template.android.application)
    alias(libs.plugins.template.android.application.compose)
}

android {
    namespace = "com.samples.template"

    defaultConfig {
        applicationId = "com.samples.template"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(libs.androidx.activity.compose)
}