plugins {
    alias(libs.plugins.sefirah.android.library)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.kotlin.parcelize)
}

android {
    namespace = "sefirah.data"
}

tasks.withType<com.android.build.gradle.tasks.VerifyLibraryResourcesTask>().configureEach {
    enabled = false
}

dependencies {
    api(projects.domain)
    api(projects.core.network)
    api(projects.core.database)

    implementation(libs.datastore)

    implementation(libs.ktor.client.core)

    implementation(libs.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.13.0")
}