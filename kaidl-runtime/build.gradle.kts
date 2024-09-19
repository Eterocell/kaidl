plugins {
    id("com.android.library")
    id("kotlin-android")
    `maven-publish`
}


android {
    namespace = "com.github.kr328.kaidl"
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    compileOnly(libs.coroutine)
}
