plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "de.kirox.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "de.kirox.app"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "0.0.2"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    applicationVariants.all {
        this.outputs
            .map { it as com.android.build.gradle.internal.api.ApkVariantOutputImpl }
            .forEach { output ->
                val apkName =
                    "kirox-${versionName}-${this.buildType.name}.apk"
                output.outputFileName = apkName
            }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}