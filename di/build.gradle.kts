plugins {
    `kotlin-dsl`
    id("kotlin")
}

dependencies {
    implementation(projects.common)
    implementation(projects.desktop)

    implementation(libs.koin.core)
}
