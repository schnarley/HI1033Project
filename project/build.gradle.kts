// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("com.google.devtools.ksp") version "2.0.21-1.0.27" apply false
    id("com.google.dagger.hilt.android") version "2.49" apply false


}
buildscript {
    dependencies {
        classpath(libs.androidx.navigation.safe.args.gradle.plugin)
        classpath(libs.hilt.android.gradle.plugin)
        classpath(libs.gradle)
    }
}

allprojects {
}

configurations.all {
    resolutionStrategy {
        force("androidx.lifecycle:lifecycle-extensions:2.2.0")
        force("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
        force("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
        force("androidx.core:core:1.15.0")
    }
}